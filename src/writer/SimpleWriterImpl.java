package writer;

public class SimpleWriterImpl implements IWriter{
    @Override
    public void write(String s) {
        System.out.println("+++++-->" + s);
    }
}
