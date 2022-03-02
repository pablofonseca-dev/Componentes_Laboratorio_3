package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import writer.IWriter;

public class MySpringWriterBeanWithDependency{
    public IWriter writer;

    @Autowired
    public void setWriter(IWriter pWriter){
        this.writer = pWriter;
    }

    public void run(){
        String s = "Sample string";
        writer.write(s);
    }
}