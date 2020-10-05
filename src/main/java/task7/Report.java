package task7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;


public class Report {

  DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  Date date = new Date();

  public  void writeOperation (EntryData entrydata, double res) {
    Formatter f = new Formatter();
    Formatter f1 = new Formatter();
    Formatter f2 = new Formatter();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("log_task7.txt", true))) {
      writer.write(f.format("%.4f",entrydata.getNumber1()) + " " + entrydata.getSymbol() + " "
              + f1.format("%.4f",entrydata.getNumber2()) + " = " + f2.format("%.4f", res) + " (Дата и время операции: " + dateFormat.format(date) + ")" + " \n" );

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
