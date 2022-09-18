package io.github.kongpf8848.pattern.decorator;

import java.io.*;

public class UpperCaseReader extends FilterReader {
    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
    protected UpperCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int result= super.read(cbuf, off, len);
        for(int i=off;i<len;i++){
            if(Character.isLowerCase(cbuf[i]))
            {
                cbuf[i]=Character.toUpperCase(cbuf[i]);
            }
        }
        return result;
    }


    public static void main(String[]args) throws IOException {
        Reader reader = new BufferedReader(new UpperCaseReader(new FileReader(new File("C:\\Users\\pengf\\Desktop\\temp\\62.txt"))));
        int i =0;
        while((i=reader.read())!=-1){
            System.out.print((char)i);
        }
    }


}
