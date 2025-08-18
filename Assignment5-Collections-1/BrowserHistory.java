import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage); 
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");

        browser.back();    
        browser.back();   
        browser.forward();
    }
}
