import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String[] colors = new String[]{
            "white", "purple", "red", "green", "pink", "blue", "orange", "black"
    };

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("colors.txt"));
            int i = 0;
            while(scanner.hasNextLine()){
                colors[i] = scanner.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        MainMenu mainMenu = new MainMenu();

    }

    public static String getSVG(int[] state) {
        String[] colors2 = new String[]{
                "st6", "st0", "st5", "st2", "st3", "st1", "st4", "st7"
        };
        System.out.println(colors2[state[4]]);
        String returnedString = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<!-- Generator: Adobe Illustrator 24.2.1, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->\n" +
                "<svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\"\n" +
                "\t viewBox=\"0 0 350.15 305.01\" style=\"enable-background:new 0 0 350.15 305.01;\" xml:space=\"preserve\">\n" +
                "<style type=\"text/css\">\n" +
                "\t.st0{fill:#D80F0F;}\n" +
                "\t.st1{fill:#777777;}\n" +
                "\t.st2{fill:#E58903;}\n" +
                "\t.st3{fill:#006EDB;}\n" +
                "\t.st4{fill:#06932B;}\n" +
                "\t.st5{fill:#5D18C9;}\n" +
                "\t.st6{fill:#E0FC3F;}\n" +
                "</style>\n" +
                "<path d=\"M7.76,289.39L169.53,9.21c2.47-4.27,8.64-4.27,11.1,0l161.76,280.18c2.47,4.27-0.62,9.62-5.55,9.62H13.31\n" +
                "\tC8.38,299,5.29,293.66,7.76,289.39z\"/>\n" +
                "<path class=\"" + colors2[state[10]] + "\" d=\"M160.99,293h-60.92c-2.9,0-3.93-3.84-1.42-5.29l38.63-22.29c1.11-0.64,2.51-0.46,3.42,0.45l22.29,22.29\n" +
                "\tC164.78,289.95,163.51,293,160.99,293z\"/>\n" +
                "<path class=\"" + colors2[state[12]] + "\" d=\"M250.1,293h-60.94c-2.53,0-3.79-3.05-2-4.84l22.3-22.3c0.91-0.91,2.31-1.09,3.42-0.45l38.63,22.3\n" +
                "\tC254.03,289.16,253,293,250.1,293z\"/>\n" +
                "<path class=\"" + colors2[state[46]] + "\" d=\"M136.64,88.76v44.6c0,1.28-0.86,2.41-2.1,2.74l-30.46,8.15c-2.44,0.65-4.45-1.97-3.19-4.16l30.46-52.75\n" +
                "\tC132.8,84.83,136.64,85.86,136.64,88.76z\"/>\n" +
                "<path class=\"" + colors2[state[48]] + "\" d=\"M100.72,197.74v0.01L60.2,221.15c-2.51,1.45-5.32-1.36-3.87-3.87L86.8,164.5c1.26-2.19,4.54-1.76,5.19,0.68\n" +
                "\tL100.72,197.74z\"/>\n" +
                "<path class=\"" + colors2[state[28]] + "\" d=\"M289.96,221.14l-38.63-22.31c-1.11-0.64-1.65-1.95-1.32-3.19l8.17-30.46c0.65-2.44,3.93-2.87,5.19-0.68\n" +
                "\tl30.47,52.77C295.28,219.78,292.47,222.59,289.96,221.14z\"/>\n" +
                "<path class=\"" + colors2[state[30]] + "\" d=\"M246.09,144.26l-30.48-8.17c-1.24-0.33-2.1-1.46-2.1-2.74V88.74c0-2.9,3.84-3.93,5.29-1.42l30.48,52.78\n" +
                "\tC250.54,142.29,248.53,144.92,246.09,144.26z\"/>\n" +
                "<path class=\"" + colors2[state[38]] + "\" d=\"M200.4,63.96h-50.65c-2.18,0-3.55-2.36-2.45-4.25l25.33-43.87c1.09-1.89,3.82-1.89,4.91,0l25.32,43.87\n" +
                "\tC203.95,61.6,202.58,63.96,200.4,63.96z\"/>\n" +
                "<path class=\"" + colors2[state[56]] + "\" d=\"M68.16,293H17.51c-2.18,0-3.55-2.36-2.45-4.25l25.33-43.87c1.09-1.89,3.82-1.89,4.91,0l25.32,43.87\n" +
                "\tC71.71,290.64,70.34,293,68.16,293z\"/>\n" +
                "<path class=\"" + colors2[state[20]] + "\" d=\"M332.64,293h-50.65c-2.18,0-3.55-2.36-2.45-4.25l25.32-43.87c1.09-1.89,3.82-1.89,4.91,0l25.33,43.87\n" +
                "\tC336.19,290.64,334.82,293,332.64,293z\"/>\n" +
                "<path class=\"" + colors2[state[45]] + "\" d=\"M168.83,104.41l-21.34,21.34c-1.79,1.79-4.84,0.52-4.84-2V81.07c0-2.53,3.05-3.79,4.84-2l21.34,21.34\n" +
                "\tC169.93,101.51,169.93,103.3,168.83,104.41z\"/>\n" +
                "<path class=\"" + colors2[state[36]] + "\" d=\"M198.42,74.8l-21.34,21.35c-1.11,1.11-2.9,1.11-4.01,0L151.73,74.8c-1.79-1.79-0.52-4.84,2-4.84h42.68\n" +
                "\tC198.94,69.96,200.21,73.02,198.42,74.8z\"/>\n" +
                "<path class=\"" + colors2[state[31]] + "\" d=\"M207.5,81.06v42.68c0,2.53-3.05,3.79-4.84,2l-21.34-21.34c-1.11-1.11-1.11-2.9,0-4.01l21.34-21.34\n" +
                "\tC204.45,77.27,207.5,78.53,207.5,81.06z\"/>\n" +
                "<path class=\"" + colors2[state[4]] + "\" d=\"M196.42,134.83h-42.68c-2.53,0-3.79-3.05-2-4.84l21.34-21.34c1.11-1.11,2.9-1.11,4.01,0L198.42,130\n" +
                "\tC200.21,131.78,198.94,134.83,196.42,134.83z\"/>\n" +
                "<path class=\"" + colors2[state[27]] + "\" d=\"M260.29,241.18l-7.81-29.15c-0.65-2.44,1.97-4.45,4.16-3.19l36.96,21.34c2.19,1.26,1.76,4.54-0.68,5.19\n" +
                "\tl-29.15,7.81C262.25,243.59,260.7,242.69,260.29,241.18z\"/>\n" +
                "<path class=\"" + colors2[state[18]] + "\" d=\"M271.13,281.62l-7.82-29.15c-0.41-1.51,0.49-3.07,2-3.47l29.16-7.81c2.44-0.65,4.45,1.97,3.19,4.16\n" +
                "\tl-21.34,36.97C275.06,284.49,271.79,284.06,271.13,281.62z\"/>\n" +
                "<path class=\"" + colors2[state[13]] + "\" d=\"M261.18,286.35l-36.96-21.34c-2.19-1.26-1.76-4.54,0.68-5.19l29.15-7.81c1.51-0.41,3.07,0.49,3.47,2l7.82,29.15\n" +
                "\tC265.99,285.6,263.37,287.61,261.18,286.35z\"/>\n" +
                "<path class=\"" + colors2[state[8]] + "\" d=\"M220.15,249.86l21.34-36.96c1.26-2.19,4.54-1.76,5.19,0.68l7.81,29.15c0.4,1.51-0.49,3.07-2,3.47l-29.15,7.81\n" +
                "\tC220.9,254.67,218.89,252.05,220.15,249.86z\"/>\n" +
                "<path class=\"" + colors2[state[9]] + "\" d=\"M96.11,252.01l29.15,7.81c2.44,0.65,2.87,3.93,0.68,5.19l-36.96,21.34c-2.19,1.26-4.81-0.75-4.16-3.19\n" +
                "\tl7.81-29.15C93.04,252.5,94.6,251.6,96.11,252.01z\"/>\n" +
                "<path class=\"" + colors2[state[54]] + "\" d=\"M55.67,241.18l29.16,7.81c1.51,0.4,2.41,1.96,2,3.47l-7.81,29.16c-0.65,2.44-3.93,2.87-5.19,0.68l-21.34-36.97\n" +
                "\tC51.22,243.15,53.23,240.53,55.67,241.18z\"/>\n" +
                "<path class=\"" + colors2[state[49]] + "\" d=\"M56.55,230.19l36.96-21.34c2.19-1.26,4.81,0.75,4.16,3.19l-7.81,29.15c-0.41,1.51-1.96,2.41-3.47,2l-29.15-7.81\n" +
                "\tC54.8,234.73,54.37,231.45,56.55,230.19z\"/>\n" +
                "<path class=\"" + colors2[state[0]] + "\" d=\"M108.67,212.9l21.34,36.96c1.26,2.19-0.75,4.81-3.19,4.16l-29.15-7.82c-1.51-0.41-2.41-1.96-2-3.47l7.81-29.15\n" +
                "\tC104.13,211.15,107.4,210.71,108.67,212.9z\"/>\n" +
                "<path class=\"" + colors2[state[3]] + "\" d=\"M202.86,145.09l-25.32,43.87c-1.09,1.89-3.82,1.89-4.91,0l-25.33-43.87c-1.09-1.89,0.27-4.25,2.45-4.25h50.65\n" +
                "\tC202.58,140.83,203.95,143.2,202.86,145.09z\"/>\n" +
                "<path class=\"" + colors2[state[6]] + "\" d=\"M238.29,206.46l-25.32,43.86c-1.09,1.89-3.82,1.89-4.91,0l-24.59-42.59l-0.73-1.27\n" +
                "\tc-1.09-1.89,0.27-4.25,2.45-4.25h50.65C238.01,202.2,239.38,204.57,238.29,206.46z\"/>\n" +
                "<path class=\"" + colors2[state[1]] + "\" d=\"M167.42,206.46l-25.33,43.87c-1.09,1.89-3.82,1.89-4.91,0l-25.32-43.87c-1.09-1.89,0.27-4.25,2.45-4.25h50.65\n" +
                "\tC167.15,202.2,168.52,204.57,167.42,206.46z\"/>\n" +
                "<path class=\"" + colors2[state[5]] + "\" d=\"M200.4,257.57h-50.65c-2.18,0-3.55-2.36-2.45-4.25l25.33-43.87c1.09-1.89,3.82-1.89,4.91,0l25.32,43.87\n" +
                "\tC203.95,255.21,202.58,257.57,200.4,257.57z\"/>\n" +
                "<path class=\"" + colors2[state[2]] + "\" d=\"M164.97,196.2h-50.66c-2.18,0-3.55-2.36-2.45-4.25l25.33-43.87c1.09-1.89,3.82-1.89,4.91,0l25.33,43.87\n" +
                "\tC168.52,193.84,167.15,196.2,164.97,196.2z\"/>\n" +
                "<path class=\"" + colors2[state[7]] + "\" d=\"M235.84,196.2h-50.66c-2.18,0-3.55-2.36-2.45-4.25l25.33-43.87c1.09-1.89,3.82-1.89,4.91,0l25.33,43.87\n" +
                "\tC239.39,193.84,238.02,196.2,235.84,196.2z\"/>\n" +
                "<path class=\"" + colors2[state[47]] + "\" d=\"M130,148.53l-21.34,36.97c-1.26,2.19-4.54,1.76-5.19-0.68l-7.81-29.16c-0.41-1.51,0.49-3.07,2-3.47l29.15-7.81\n" +
                "\tC129.25,143.72,131.26,146.34,130,148.53z\"/>\n" +
                "<path class=\"" + colors2[state[29]] + "\" d=\"M241.5,185.5l-21.35-36.96c-1.26-2.19,0.75-4.81,3.19-4.16l29.16,7.81c1.51,0.41,2.41,1.96,2,3.47l-7.82,29.15\n" +
                "\tC246.04,187.25,242.76,187.68,241.5,185.5z\"/>\n" +
                "<path class=\"" + colors2[state[11]] + "\" d=\"M153.73,263.57l42.68,0c2.53,0,3.79,3.05,2,4.84l-21.35,21.35c-1.11,1.11-2.9,1.11-4.01,0l-21.34-21.34\n" +
                "\tC149.94,266.63,151.21,263.57,153.73,263.57z\"/>\n" +
                "</svg>\n";
        return returnedString;
    }

    public static String drawScramble(int state[]){
        String returnedString = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<svg version=\"1.1\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\"\n" +
                "\t viewBox=\"0 0 98 98\" style=\"enable-background:new 0 0 98 98;\" xml:space=\"preserve\">\n" +
                "<style type=\"text/css\">\n" +
                "\t.st0{fill:#FFFFFF;stroke:#808080;stroke-width:5;}\n" +
                "\t.st1{fill:#FFFFFF;stroke:#808080;stroke-width:0.1;}\n" +
                "</style>\n" +
                "<polygon\n" +
                "\tid=\"outer_square1\"\n" +
                "\tpoints=\"19,9.6 19,45.1 54.5,45.1 54.5,9.6\"\n" +
                "\tstyle=\"fill:white;stroke:gray;stroke-width:2.5\"/>\n" +
                "<polygon\n" +
                "\tid=\"outer_square2\"\n" +
                "\tpoints=\"19,51.7 54.5,51.7 54.5,87.2 19,87.2\"\n" +
                "\tstyle=\"fill:white;stroke:gray;stroke-width:2.5\"/>\n" +
                "\n" +
                "<polygon id=\"0\" points=\"19,9.6 30.8,9.6 24.9,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[0]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"1\" points=\"30.8,9.6 24.9,15.5 36.8,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[1]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"2\" points=\"30.8,9.6 36.8,15.5 42.7,9.6 \"\n" +
                "\tstyle=\"fill:" + colors[state[2]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"3\" points=\"36.8,15.5 42.7,9.6 48.6,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[3]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"4\" points=\"42.7,9.6 48.6,15.5 54.5,9.6\"\n" +
                "\tstyle=\"fill:" + colors[state[4]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"5\" points=\"24.9,15.5 30.8,21.4 36.8,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[5]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"6\" points=\"30.8,21.4 36.8,15.5 42.7,21.4\"\n" +
                "\tstyle=\"fill:" + colors[state[6]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"7\" points=\"36.8,15.5 42.7,21.4 48.6,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[7]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"8\" points=\"30.8,21.4 36.8,27.3 42.7,21.4\"\n" +
                "\tstyle=\"fill:" + colors[state[8]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"9\" points=\"19,21.4 24.9,15.5 19,9.6\"\n" +
                "\tstyle=\"fill:" + colors[state[9]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"10\" points=\"24.9,27.3 19,21.4 24.9,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[10]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"11\" points=\"24.9,27.3 30.8,21.4 24.9,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[11]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"12\" points=\"30.8,33.3 24.9,27.3 30.8,21.4\"\n" +
                "\tstyle=\"fill:" + colors[state[12]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"13\" points=\"30.8,33.3 36.8,27.3 30.8,21.4\"\n" +
                "\tstyle=\"fill:" + colors[state[13]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"14\" points=\"19,33.3 24.9,27.3 19,21.4\"\n" +
                "\tstyle=\"fill:" + colors[state[14]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"15\" points=\"19,33.3 24.9,39.2 24.9,27.3\"\n" +
                "\tstyle=\"fill:" + colors[state[15]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"16\" points=\"24.9,39.2 30.8,33.3 24.9,27.3\"\n" +
                "\tstyle=\"fill:" + colors[state[16]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"17\" points=\"19,45.1 19,33.3 24.9,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[17]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"18\" points=\"42.7,33.3 36.8,27.3 30.8,33.3\"\n" +
                "\tstyle=\"fill:" + colors[state[18]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"19\" points=\"36.8,39.2 30.8,33.3 24.9,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[19]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"20\" points=\"42.7,33.3 36.8,39.2 30.8,33.3\"\n" +
                "\tstyle=\"fill:" + colors[state[20]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"21\" points=\"48.6,39.2 42.7,33.3 36.8,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[21]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"22\" points=\"30.8,45.1 24.9,39.2 19,45.1\"\n" +
                "\tstyle=\"fill:" + colors[state[22]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"23\" points=\"36.8,39.2 30.8,45.1 24.9,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[23]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"24\" points=\"42.7,45.1 36.8,39.2 30.8,45.1\"\n" +
                "\tstyle=\"fill:" + colors[state[24]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"25\" points=\"42.7,45.1 48.6,39.2 36.8,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[25]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"26\" points=\"54.5,45.1 42.7,45.1 48.6,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[26]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"27\" points=\"42.7,21.4 36.8,27.3 42.7,33.3\"\n" +
                "\tstyle=\"fill:" + colors[state[27]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"28\" points=\"42.7,21.4 48.6,27.3 42.7,33.3\"\n" +
                "\tstyle=\"fill:" + colors[state[28]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"29\" points=\"48.6,15.5 42.7,21.4 48.6,27.3\"\n" +
                "\tstyle=\"fill:" + colors[state[29]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"30\" points=\"54.5,21.4 48.6,15.5 48.6,27.3\"\n" +
                "\tstyle=\"fill:" + colors[state[30]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"31\" points=\"54.5,9.6 54.5,21.4 48.6,15.5\"\n" +
                "\tstyle=\"fill:" + colors[state[31]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"32\" points=\"48.6,27.3 42.7,33.3 48.6,39.2 \"\n" +
                "\tstyle=\"fill:" + colors[state[32]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"33\" points=\"48.6,27.3 54.5,33.3 48.6,39.2\"\n" +
                "\tstyle=\"fill:" + colors[state[33]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"34\" points=\"54.5,21.4 48.6,27.3 54.5,33.3\"\n" +
                "\tstyle=\"fill:" + colors[state[34]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"35\" points=\"54.5,33.3 48.6,39.2 54.5,45.1\"\n" +
                "\tstyle=\"fill:" + colors[state[35]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"36\" points=\"19,63.5 24.9,57.6 19,51.7\"\n" +
                "\tstyle=\"fill:" + colors[state[36]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"37\" points=\"19,75.4 24.9,69.4 19,63.5\"\n" +
                "\tstyle=\"fill:" + colors[state[37]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"38\" points=\"24.9,69.4 19,63.5 24.9,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[38]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"39\" points=\"24.9,69.4 30.8,63.5 24.9,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[39]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"40\" points=\"19,87.2 19,75.4 24.9,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[40]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"41\" points=\"19,75.4 24.9,81.3 24.9,69.4\"\n" +
                "\tstyle=\"fill:" + colors[state[41]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"42\" points=\"24.9,81.3 30.8,75.4 24.9,69.4\"\n" +
                "\tstyle=\"fill:" + colors[state[42]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"43\" points=\"30.8,75.4 24.9,69.4 30.8,63.5\"\n" +
                "\tstyle=\"fill:" + colors[state[43]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"44\" points=\"30.8,75.4 36.8,69.4 30.8,63.5\"\n" +
                "\tstyle=\"fill:" + colors[state[44]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"45\" points=\"19,51.7 30.8,51.7 24.9,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[45]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"46\" points=\"30.8,51.7 24.9,57.6 36.8,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[46]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"47\" points=\"30.8,51.7 36.8,57.6 42.7,51.7\"\n" +
                "\tstyle=\"fill:" + colors[state[47]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"48\" points=\"36.8,57.6 42.7,51.7 48.6,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[48]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"49\" points=\"42.7,51.7 48.6,57.6 54.5,51.7\"\n" +
                "\tstyle=\"fill:" + colors[state[49]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"50\" points=\"24.9,57.6 30.8,63.5 36.8,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[50]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"51\" points=\"30.8,63.5 36.8,57.6 42.7,63.5\"\n" +
                "\tstyle=\"fill:" + colors[state[51]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"52\" points=\"36.8,57.6 42.7,63.5 48.6,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[52]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"53\" points=\"30.8,63.5 36.8,69.4 42.7,63.5\"\n" +
                "\tstyle=\"fill:" + colors[state[53]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"54\" points=\"54.5,51.7 54.5,63.5 48.6,57.6\"\n" +
                "\tstyle=\"fill:" + colors[state[54]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"55\" points=\"48.6,57.6 42.7,63.5 48.6,69.4\"\n" +
                "\tstyle=\"fill:" + colors[state[55]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"56\" points=\"54.5,63.5 48.6,57.6 48.6,69.4\"\n" +
                "\tstyle=\"fill:" + colors[state[56]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"57\" points=\"54.5,63.5 48.6,69.4 54.5,75.4\"\n" +
                "\tstyle=\"fill:" + colors[state[57]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"58\" points=\"42.7,63.5 36.8,69.4 42.7,75.4\"\n" +
                "\tstyle=\"fill:" + colors[state[58]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"59\" points=\"42.7,63.5 48.6,69.4 42.7,75.4\"\n" +
                "\tstyle=\"fill:" + colors[state[59]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"60\" points=\"48.6,69.4 42.7,75.4 48.6,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[60]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"61\" points=\"48.6,69.4 54.5,75.4 48.6,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[61]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"62\" points=\"54.5,75.4 48.6,81.3 54.5,87.2\"\n" +
                "\tstyle=\"fill:" + colors[state[62]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"63\" points=\"54.5,87.2 42.7,87.2 48.6,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[63]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"64\" points=\"42.7,87.2 48.6,81.3 36.8,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[64]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"65\" points=\"42.7,87.2 36.8,81.3 30.8,87.2\"\n" +
                "\tstyle=\"fill:" + colors[state[65]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"66\" class=\"st1\" points=\"36.8,81.3 30.8,87.2 24.9,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[66]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"67\" class=\"st1\" points=\"30.8,87.2 24.9,81.3 19,87.2\"\n" +
                "\tstyle=\"fill:" + colors[state[67]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"68\" class=\"st1\" points=\"48.6,81.3 42.7,75.4 36.8,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[68]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"69\" points=\"42.7,75.4 36.8,81.3 30.8,75.4\"\n" +
                "\tstyle=\"fill:" + colors[state[69]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"70\" class=\"st1\" points=\"36.8,81.3 30.8,75.4 24.9,81.3\"\n" +
                "\tstyle=\"fill:" + colors[state[70]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"71\" class=\"st1\" points=\"42.7,75.4 36.8,69.4 30.8,75.4\"\n" +
                "\tstyle=\"fill:" + colors[state[71]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "\n" +
                "<polygon\n" +
                "\tid=\"u_face\"\n" +
                "\tpoints=\"19,9.6 54.5,9.6 36.8,27.3\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"l_face\"\n" +
                "\tpoints=\"19,45.1 19,9.6 36.8,27.3\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"r_face\"\n" +
                "\tpoints=\"54.5,9.6 54.5,45.1 36.8,27.3\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"f_face\"\n" +
                "\tpoints=\"54.5,45.1 19,45.1 36.8,27.3\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"b_face\"\n" +
                "\tpoints=\"19,51.7 54.5,51.7 36.8,69.4\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"br_face\"\n" +
                "\tpoints=\"19,87.2 19,51.7 36.8,69.4\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"bl_face\"\n" +
                "\tpoints=\"54.5,51.7 54.5,87.2 36.8,69.4\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon\n" +
                "\tid=\"d_face\"\n" +
                "\tpoints=\"54.5,87.2 19,87.2 36.8,69.4\"\n" +
                "\tstyle=\"fill:none;stroke:gray;stroke-width:1\"/>\n" +
                "</svg>\n";
        return returnedString;
    }
}
