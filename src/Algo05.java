import java.util.*;
public class Algo05 {
    public static String solution(String s) {
        String answer = "";
        String[] str= s.split("");
        String a = Arrays.toString(str);
        System.out.println(a); //[w, e, l, c, o, m, e,  , t, o,  , j, a, v, a,  , w, o, r, l, d]
        int count = 0; //str의 글자위치를 가리킴 1이 증가할때마다 홀짝이 번갈아 바뀜
        for(int i = 0; i< str.length; i++){
            if(str[i].equals(" ")){
                count = 0;//띄어쓰기를 할때는 짝수홀수의 변화를 멈춤
            } else if(count%2==0){
                str[i] = str[i].toUpperCase();//0,짝수번째 문자열을 대문자로 치환 - 입력문자의 홀수번째글자
                count++; //글자위치를 한칸뒤로 넘김
            } else if(count%2 != 0){
                str[i]= str[i].toLowerCase();
                count++; //글자위치를 한칸뒤로 넘김
            }
            answer += str[i];  //str[0]+str[1]+...+str[20]
        }
        System.out.println(answer); //WeLcOmE To JaVa WoRlD
        return answer;
    }
}
