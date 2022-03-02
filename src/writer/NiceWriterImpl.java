package writer;

public class NiceWriterImpl implements IWriter{

    @Override
    public void write(String s) {
        System.out.println("The String is " + s);
    }
}
