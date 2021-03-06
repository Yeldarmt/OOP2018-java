package Task1;

import java.io.*;

public class Writer {
    Operations print = new Operations();

    public void wrt(int[] Mx){
        try{
            FileReader f_read = new FileReader("scores.txt");
            FileWriter f_write = new FileWriter("grades.txt");
            BufferedReader buf_read = new BufferedReader(f_read);
            BufferedWriter buf_write = new BufferedWriter(f_write);
            String line = buf_read.readLine();
            while(line!=null){
                String[] array = line.split(" ");
                String s= print.Sort(Mx[0],Integer.parseInt(array[2]));
                String w = "";
                w = array[0]+" "+array[1]+" - "+s;
                buf_write.write(w+"\n");
                line =buf_read.readLine();
            }
            buf_read.close();
            String avg = "Average - " + Mx[2];
            String maxx = "Maximum - " + Mx[0];
            String minn = "Minimum - " + Mx[1];
            buf_write.write(avg+"\n" + maxx + "\n" + minn);
            buf_write.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
