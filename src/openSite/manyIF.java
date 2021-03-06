package openSite;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalTime;
import java.util.Map;

import static openSite.mkGUI.*;

public class manyIF extends JOptionPane {
    static int now = temp1.now;
    static int breakTimeReduced = 15 - Integer.parseInt(mkGUI.times[0]);
    static int studyTimeReduced = 40 - Integer.parseInt(mkGUI.times[1]);
    static int allReduced = breakTimeReduced + studyTimeReduced;
    static int[] allTimes = new int[]{845 - breakTimeReduced, 930, 1025, 1120, 1215, 1305, 1340, 1435, 1440, 1530, 1535};
    static int[] shorterAllTimes = new int[11];
    static boolean[] isClass7 = new boolean[5];
    static String[] saveTimetable = new String[mkGUI.timetable.length];
    static String[] URLs = new String[mkGUI.timetable.length];
    manyIF(int shortenedTime, String[] timetable, Map<String, String> nameURL) {
        saveTimetable = timetable;
        for (int i = 0; i < isClass7.length; i++) {
            isClass7[i] = !(timetable[((i + 1) * 7) - 1].equals(""));
        }
        for (int i = 0; i < saveTimetable.length; i++) {
            URLs[i] = nameURL.get(saveTimetable[i]);
        }
        for (int i = 1; i < allTimes.length; i++) {
            String[] strArray = new String[]{
                    String.valueOf(allTimes[i]-allReduced),
                    String.valueOf(allTimes[i]).substring(0,1),
                    String.valueOf(allTimes[i]).substring(0,2)};
            if(!strArray[0].substring(0,1).equals(strArray[1]) || !strArray[0].substring(0,2).equals(strArray[2])) {
                allTimes[i] -= allReduced + 40;
            } else {
                allTimes[i] -= allReduced;
            }
        }
        shorterAllTimes[0] = allTimes[0];
        for (int i = 1; i < shorterAllTimes.length; i++) {
            shorterAllTimes[i]= allTimes[i];
            String[] strArray = new String[]{
                    String.valueOf(shorterAllTimes[i]-allReduced-shortenedTime),
                    String.valueOf(shorterAllTimes[i]).substring(0,1),
                    String.valueOf(shorterAllTimes[i]).substring(0,2)};
            if(!strArray[0].substring(0,1).equals(strArray[1]) || !strArray[0].substring(0,2).equals(strArray[2])) {
                shorterAllTimes[i] -= allReduced + shortenedTime + 40;
            } else {
                shorterAllTimes[i] -= allReduced + shortenedTime;
            }
        }
    }
    static void manyIFNowClass() {
        switch (temp1.date) {
            case 1 -> {
                if(now < allTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now < allTimes[1]) {
                    desktopView(URLs[0]);
                } else if(now < allTimes[2]) {
                    desktopView(URLs[1]);
                } else if(now < allTimes[3]) {
                    desktopView(URLs[2]);
                } else if(now < allTimes[5]) {
                    desktopView(URLs[3]);
                } else if(now < allTimes[6]) {
                    desktopView(URLs[4]);
                } else if(now < allTimes[7]) {
                    desktopView(URLs[5]);
                } else if(now < allTimes[9] && isClass7[0]) {
                    desktopView(URLs[6]);
                } else if(now > allTimes[8] && !isClass7[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now > allTimes[10] && isClass7[0]) {
                    desktopView(mkGUI.URLs[0]);
                }
            }
            case 2 -> {
                if(now < allTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now < allTimes[1]) {
                    desktopView(URLs[7]);
                } else if(now < allTimes[2]) {
                    desktopView(URLs[8]);
                } else if(now < allTimes[3]) {
                    desktopView(URLs[9]);
                } else if(now < allTimes[5]) {
                    desktopView(URLs[10]);
                } else if(now < allTimes[6]) {
                    desktopView(URLs[11]);
                } else if(now < allTimes[7]) {
                    desktopView(URLs[12]);
                } else if(now < allTimes[9] && isClass7[1]) {
                    desktopView(URLs[13]);
                } else if(now > allTimes[8] && !isClass7[1]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now > allTimes[10] && isClass7[1]) {
                    desktopView(mkGUI.URLs[0]);
                }
            }
            case 3 -> {
                if(now < allTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now < allTimes[1]) {
                    desktopView(URLs[14]);
                } else if(now < allTimes[2]) {
                    desktopView(URLs[15]);
                } else if(now < allTimes[3]) {
                    desktopView(URLs[16]);
                } else if(now < allTimes[5]) {
                    desktopView(URLs[17]);
                } else if(now < allTimes[6]) {
                    desktopView(URLs[18]);
                } else if(now < allTimes[7]) {
                    desktopView(URLs[19]);
                } else if(now < allTimes[9] && isClass7[2]) {
                    desktopView(URLs[20]);
                } else if(now > allTimes[8] && !isClass7[2]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now > allTimes[10] && isClass7[2]) {
                    desktopView(mkGUI.URLs[0]);
                }
            }
            case 4 -> {
                if(now < allTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now < allTimes[1]) {
                    desktopView(URLs[21]);
                } else if(now < allTimes[2]) {
                    desktopView(URLs[22]);
                } else if(now < allTimes[3]) {
                    desktopView(URLs[23]);
                } else if(now < allTimes[5]) {
                    desktopView(URLs[24]);
                } else if(now < allTimes[6]) {
                    desktopView(URLs[25]);
                } else if(now < allTimes[7]) {
                    desktopView(URLs[26]);
                } else if(now < allTimes[9] && isClass7[3]) {
                    desktopView(URLs[27]);
                } else if(now > allTimes[8] && !isClass7[3]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now > allTimes[10] && isClass7[3]) {
                    desktopView(mkGUI.URLs[0]);
                }
            }
            case 5 -> {
                if(now < allTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now < allTimes[1]) {
                    desktopView(URLs[28]);
                } else if(now < allTimes[2]) {
                    desktopView(URLs[29]);
                } else if(now < allTimes[3]) {
                    desktopView(URLs[30]);
                } else if(now < allTimes[5]) {
                    desktopView(URLs[31]);
                } else if(now < allTimes[6]) {
                    desktopView(URLs[32]);
                } else if(now < allTimes[7]) {
                    desktopView(URLs[33]);
                } else if(now < allTimes[9] && isClass7[4]) {
                    desktopView(URLs[35]);
                } else if(now > allTimes[8] && !isClass7[4]) {
                    desktopView(mkGUI.URLs[0]);
                } else if(now > allTimes[10] && isClass7[4]) {
                    desktopView(mkGUI.URLs[0]);
                }
            }
            default -> {
                mkJOptionPane("??????????????? ??????", "Notification", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    }
    public static void manyIFToday(boolean b, int i, String[] URLs) {
        if (b) {
            switch (i) {
                case 0 -> {
                    if(ifToday("?????????")) {
                        mkJOptionPane("?????? ????????? ???????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 0);
                    }
                }
                case 1 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 1);
                    }
                }
                case 2 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 2);
                    }
                }
                case 3 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 3);
                    }
                }
                case 4 -> {
                    if(ifToday("??????B")) {
                        mkJOptionPane("?????? ????????? ?????? B ??? ?????????????????? \n ????????? ????????? ?????????", URLs, 4);
                    }
                }
                case 5 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 5);
                    }
                }
                case 6 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 6);
                    }
                }
                case 7 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 7);
                    }
                }
                case 8 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ?????? ?????????????????? \n ????????? ????????? ?????????", URLs, 8);
                    }
                }
                case 9 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 9);
                    }
                }
                case 10 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 10);
                    }
                }
                case 11 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 11);
                    }
                }
                case 12 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 12);
                    }
                }
                case 13 -> {
                    if(ifToday("??????A")) {
                        mkJOptionPane("?????? ????????? ?????? A ??? ?????????????????? \n ????????? ????????? ?????????", URLs, 13);
                    }
                }
                case 14 -> {
                    if(ifToday("?????????")) {
                        mkJOptionPane("?????? ????????? ???????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 14);
                    }
                }
                case 15 -> {
                    if(ifToday("??????")) {
                        mkJOptionPane("?????? ????????? ????????? ?????????????????? \n ????????? ????????? ?????????", URLs, 15);
                    }
                }
            }
        }
    }
    public static boolean ifToday(String equal) {
        String[][] a = mk2DArr(timetable, 5, 7);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j].equals(equal)) {
                    if(temp1.date == i + 1) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }
    public static void nowClass(JLabel jL) {
        if(!(temp1.date == 0 || temp1.date == 6) && now < allTimes[0] || now > allTimes[10]) {
            jL.setText("?????? ??????");
        } else if(now < allTimes[1]) {
            jL.setText("1??????");
        } else if(now < allTimes[2]) {
            jL.setText("2??????");
        } else if(now < allTimes[3]) {
            jL.setText("3??????");
        } else if(now < allTimes[4]) {
            jL.setText("4??????");
        } else if(now < allTimes[5]) {
            jL.setText("??????");
        } else if(now < allTimes[6]) {
            jL.setText("5??????");
        } else if(now < allTimes[7]) {
            jL.setText("6??????");
        } else if((temp1.date == 2 ||temp1.date == 3) && now < allTimes[9]) {
            jL.setText("7??????");
        } else if(!(temp1.date == 2 ||temp1.date == 3) && now < allTimes[9]) {
            jL.setText("?????? ??????");
        }
    }
    public static boolean autoLinkingIF() {
        int min = LocalTime.now().getMinute();
        int hour = LocalTime.now().getHour();
        int innerNow = Integer.parseInt((hour == 0 ? "12" : hour) + (min < 10 ? "0" + min : String.valueOf(min)));
        switch (temp1.date) {
            case 1 -> {
                if(innerNow == shorterAllTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[1]) {
                    desktopView(URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[2]) {
                    desktopView(URLs[1]);
                    return true;
                } else if(innerNow == shorterAllTimes[3]) {
                    desktopView(URLs[2]);
                    return true;
                } else if(innerNow == shorterAllTimes[5]) {
                    desktopView(URLs[3]);
                    return true;
                } else if(innerNow == shorterAllTimes[6]) {
                    desktopView(URLs[4]);
                    return true;
                } else if(innerNow == shorterAllTimes[7]) {
                    desktopView(URLs[5]);
                    return true;
                } else if(now == shorterAllTimes[9] && isClass7[0]) {
                    desktopView(URLs[6]);
                    return true;
                } else if(now == shorterAllTimes[8] && !isClass7[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(now == shorterAllTimes[10] && isClass7[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                }
            }
            case 2 -> {
                if(innerNow == shorterAllTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[1]) {
                    desktopView(URLs[7]);
                    return true;
                } else if(innerNow == shorterAllTimes[2]) {
                    desktopView(URLs[8]);
                    return true;
                } else if(innerNow == shorterAllTimes[3]) {
                    desktopView(URLs[9]);
                    return true;
                } else if(innerNow == shorterAllTimes[5]) {
                    desktopView(URLs[10]);
                    return true;
                } else if(innerNow == shorterAllTimes[6]) {
                    desktopView(URLs[11]);
                    return true;
                } else if(innerNow == shorterAllTimes[7]) {
                    desktopView(URLs[12]);
                    return true;
                } else if(now == shorterAllTimes[9] && isClass7[1]) {
                    desktopView(URLs[13]);
                    return true;
                } else if(now == shorterAllTimes[8] && !isClass7[1]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(now == shorterAllTimes[10] && isClass7[1]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                }
            }
            case 3 -> {
                if(innerNow == shorterAllTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[1]) {
                    desktopView(URLs[14]);
                    return true;
                } else if(innerNow == shorterAllTimes[2]) {
                    desktopView(URLs[15]);
                    return true;
                } else if(innerNow == shorterAllTimes[3]) {
                    desktopView(URLs[16]);
                    return true;
                } else if(innerNow == shorterAllTimes[5]) {
                    desktopView(URLs[17]);
                    return true;
                } else if(innerNow == shorterAllTimes[6]) {
                    desktopView(URLs[18]);
                    return true;
                } else if(innerNow == shorterAllTimes[7]) {
                    desktopView(URLs[19]);
                    return true;
                } else if(now == shorterAllTimes[9] && isClass7[2]) {
                    desktopView(URLs[20]);
                    return true;
                } else if(now == shorterAllTimes[8] && !isClass7[2]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(now == shorterAllTimes[10] && isClass7[2]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                }
            }
            case 4 -> {
                if(innerNow == shorterAllTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[1]) {
                    desktopView(URLs[21]);
                    return true;
                } else if(innerNow == shorterAllTimes[2]) {
                    desktopView(URLs[22]);
                    return true;
                } else if(innerNow == shorterAllTimes[3]) {
                    desktopView(URLs[23]);
                    return true;
                } else if(innerNow == shorterAllTimes[5]) {
                    desktopView(URLs[24]);
                    return true;
                } else if(innerNow == shorterAllTimes[6]) {
                    desktopView(URLs[25]);
                    return true;
                } else if(innerNow == shorterAllTimes[7]) {
                    desktopView(URLs[26]);
                    return true;
                } else if(now == shorterAllTimes[9] && isClass7[3]) {
                    desktopView(URLs[27]);
                    return true;
                } else if(now == shorterAllTimes[8] && !isClass7[3]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(now == shorterAllTimes[10] && isClass7[3]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                }
            }
            case 5 -> {
                if(innerNow == shorterAllTimes[0]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(innerNow == shorterAllTimes[1]) {
                    desktopView(URLs[28]);
                    return true;
                } else if(innerNow == shorterAllTimes[2]) {
                    desktopView(URLs[29]);
                    return true;
                } else if(innerNow == shorterAllTimes[3]) {
                    desktopView(URLs[30]);
                    return true;
                } else if(innerNow == shorterAllTimes[5]) {
                    desktopView(URLs[31]);
                    return true;
                } else if(innerNow == shorterAllTimes[6]) {
                    desktopView(URLs[32]);
                    return true;
                } else if(innerNow == shorterAllTimes[7]) {
                    desktopView(URLs[33]);
                    return true;
                } else if(now == shorterAllTimes[9] && isClass7[4]) {
                    desktopView(URLs[34]);
                    return true;
                } else if(now == shorterAllTimes[8] && !isClass7[4]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                } else if(now == shorterAllTimes[10] && isClass7[4]) {
                    desktopView(mkGUI.URLs[0]);
                    return true;
                }
            }
            default -> {
                mkJOptionPane("??????????????? ??????", "Notification", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        return false;
    }
    public static void desktopView(String str) {
        try{
            Desktop.getDesktop().browse(new URI(str));
        } catch(IOException | URISyntaxException e) {
            mkJOptionPane("????????? ?????????????????????", "Notification", JOptionPane.ERROR_MESSAGE);
        }
    }
}