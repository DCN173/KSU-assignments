package CSE1322;

public class Lab1 {
    public static char[][] make_forward(){
        char[][] pixel = new char[4][13]; pixel[0][0]=' '; pixel[0][1]=' '; pixel[0][2]='_'; pixel[0][3]='_'; pixel[0][4]='_'; pixel[0][5]='_'; pixel[0][6]='_'; pixel[0][7]='_'; pixel[0][8]=' '; pixel[0][9]=' '; pixel[0][10]=' '; pixel[0][11]=' '; pixel[0][12]=' '; pixel[1][0]=' '; pixel[1][1]='/'; pixel[1][2]='|'; pixel[1][3]='_'; pixel[1][4]='|'; pixel[1][5]='|'; pixel[1][6]='_'; pixel[1][7]='\\'; pixel[1][8]='\''; pixel[1][9]='.'; pixel[1][10]='_'; pixel[1][11]='_'; pixel[1][12]=' '; pixel[2][0]='('; pixel[2][1]=' '; pixel[2][2]=' '; pixel[2][3]=' '; pixel[2][4]='_'; pixel[2][5]=' '; pixel[2][6]=' '; pixel[2][7]=' '; pixel[2][8]=' '; pixel[2][9]='_'; pixel[2][10]=' '; pixel[2][11]='_'; pixel[2][12]='\\'; pixel[3][0]='='; pixel[3][1]='\''; pixel[3][2]='-'; pixel[3][3]='('; pixel[3][4]='_'; pixel[3][5]=')'; pixel[3][6]='-'; pixel[3][7]='-'; pixel[3][8]='('; pixel[3][9]='_'; pixel[3][10]=')'; pixel[3][11]='-'; pixel[3][12]='\''; return pixel;
    }

    //Driver program
    public static void main(String[]args){

        char [][] asciiArt = new char[4][13];
        asciiArt = make_forward();
        //Prints ascii art
        for (int i = 0; i < asciiArt.length; i++){
            for (int y = 0; y < asciiArt[i].length; y++){
                System.out.print(asciiArt[i][y]);
            }
            System.out.println();
        }
        char[][] mirroredArray = make_mirror(make_forward());
        for (int i = 0;i<asciiArt.length;i++){
            for (int j = 0; j < asciiArt[0].length;j++){
                System.out.print(asciiArt[i][j]);
            }
            for (int j = 0; j < mirroredArray[0].length;j++){
                System.out.print(mirroredArray[i][j]);
            }
            System.out.println();
        }
    }
    //Mirrors the ascii art then prints
    public static char[][] make_mirror(char[][] originalArt){
        char[][] mirroredArt = new char[4][13];
        for (int i = 0; i < originalArt.length;i++){
            for (int j = 0; j < originalArt[0].length;j++){
                mirroredArt[i][originalArt[0].length - j - 1] = originalArt[i][j];

                if (originalArt[i][j] == ')'){
                    mirroredArt[i][originalArt[0].length - j - 1] = '(';
                } else if (originalArt[i][j] == '(') {
                    mirroredArt[i][originalArt[0].length - j - 1] = ')';
                }else if (originalArt[i][j] == '/') {
                    mirroredArt[i][originalArt[0].length - j - 1] = '\\';
                }else if (originalArt[i][j] == '\\') {
                    mirroredArt[i][originalArt[0].length - j - 1] = '/';
                }

            }
        }
        for (int i = 0; i < mirroredArt.length; i++){
            for (int y = 0; y < mirroredArt[i].length; y++){
                System.out.print(mirroredArt[i][y]);
            }
            System.out.println();
        }
        return mirroredArt;
    }
}



