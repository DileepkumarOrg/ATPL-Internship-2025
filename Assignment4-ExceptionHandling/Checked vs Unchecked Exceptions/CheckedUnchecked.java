import java.io.*;
import java.sql.SQLException;

public class CheckedUnchecked {

    public static void main(String[] args) {
        try {
            throw new IOException("This is a Checked Exception: IOException");
        } catch (IOException e) {
            System.out.println("Exceprion :  " + e);
        }

        try {
            throw new SQLException("This is a Checked Exception: SQLException");
        } catch (SQLException e) {
            System.out.println("Exceprion :  " + e);
        }

        try {
            throw new FileNotFoundException("This is a Checked Exception: FileNotFoundException");
        } catch (FileNotFoundException e) {
            System.out.println("Exceprion :  " + e);
        }

        try {
            throw new NullPointerException("This is an Unchecked Exception: NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e);
        }

        try {
            throw new ArithmeticException("This is an Unchecked Exception: ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e);
        }
    }
}
