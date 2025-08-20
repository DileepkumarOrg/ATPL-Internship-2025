import java.util.*;

public class JobScheduler {
    Queue<String> schedulerQueue = new LinkedList<>();

    public void add(String file){
        schedulerQueue.add(file);
        System.out.println(file+" is Added to the Job Scheduler Queue.");
    }

    public void processing(){
        String processingFile = schedulerQueue.poll();
        System.out.println(processingFile+" is under processing.");
    }
    public static void main(String[] args) {
        JobScheduler schedulerObject = new JobScheduler();
        schedulerObject.add("File1");
        schedulerObject.add("File2");
        schedulerObject.add("File3");
        schedulerObject.add("File4");
        schedulerObject.add("File5");
        System.out.println(schedulerObject.schedulerQueue);
        schedulerObject.processing();
        schedulerObject.processing();
        System.out.println(schedulerObject.schedulerQueue);

    }
}
