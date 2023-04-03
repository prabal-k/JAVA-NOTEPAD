import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class For_file
{
  String str;
  void Calculation(ForFrame frame2) throws Exception
  {
    File file=new File("Notepad.txt");
    file.createNewFile();

    FileWriter fileWriter= new FileWriter(file);
    str=frame2.textarea.getText();

    fileWriter.write(str);

    fileWriter.close();


  }
}
