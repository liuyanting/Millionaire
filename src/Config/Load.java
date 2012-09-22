/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andy
 */
public class Load {
    private int random;
    
    private String question;
    private String[] options={"","","",""};
    private int solution;

    public Load() {
        random = generateRandom(1, 5);       
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String[] getOptions() {
        return options;
    }
    
    public int getSolution() {
        return solution;
    }
    
    private int generateRandom(int Min, int Max) {
        return Min + (int)(Math.random() * ((Max-Min)+1));
    }
    
    private void setSolution(String input) {
        solution = 0;
        for(int count=0; count<options.length; count++) {
            if(input.equals(options[count])) {
                solution = count;
                break;
            }
        }
    }
    
    private void setQuestion(String input) {
        question = input;
    }
    
    private void setOptions(int index, String input) {
        options[index] = input;
    }
    
    //&Qlevel_random=question
    //&Qlevel_random_
    
    public void loadFile(int level) {
        //File file = new File("C:\\Users\\Andy\\Documents\\NetBeansProjects\\Millionaire\\question.txt");
        String concatResult;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            concatResult = "\\questions.txt";
        } else {
            concatResult = "/questions.txt";
        }
        File file = new File((new File(".").getAbsolutePath()).concat(concatResult));
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"Big5"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }

        String line;
        try {
            while((line = br.readLine()) != null) {
                String[] tokens = line.split("&Q|_|=|&");

                if(tokens.length == 1) continue;
                
                int tempLevel = Integer.parseInt(tokens[1]);
                int tempRandom = Integer.parseInt(tokens[2]);
                
                if((tempLevel == level) && (tempRandom == random)) {
                    if(tokens.length <= 4)
                        setQuestion(tokens[3]);
                    else {
                        if(tokens[4].equals("real")) {
                            setSolution(tokens[5]);
                            break;
                        }
                        else if(tokens[4].equals("a"))
                            setOptions(0, tokens[5]);
                        else if(tokens[4].equals("b"))
                            setOptions(1, tokens[5]);
                        else if(tokens[4].equals("c"))
                                setOptions(2, tokens[5]);
                        else if(tokens[4].equals("d"))
                                setOptions(3, tokens[5]);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
