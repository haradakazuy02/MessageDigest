package jp.gr.java_conf.harada;
import java.security.MessageDigest;
import java.io.*;
import java.math.BigInteger;

public class MD {
  public static void main(String[] args) {
    if (1 >= args.length) {
      System.out.println("MD [algorithm] [file] : show message digest of [file]");
      System.exit(1);
    }
    try {
      MessageDigest md = MessageDigest.getInstance(args[0]);
      InputStream ins = new FileInputStream(args[1]);
      byte[] b = new byte[0x100000];
      boolean end = false;
      while (!end) {
        int n = ins.read(b);
        if (n == -1) end = true;
        else md.update(b, 0, n);
      }
      BigInteger bi = new BigInteger(1, md.digest());
      System.out.println(bi.toString(16));
    } catch (Exception e) {
      e.printStackTrace(System.out);
    }
  }
}
