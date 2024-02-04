package Week_02;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 자료구조명을 입력해 주세요. (List / Set / Map)");
        String form = sc.nextLine();  //자료구조형
        String title;
        switch (form) {
            //List
            case "List" : ArrayList<String> List = new ArrayList<>();
                //저장하기
                title = sc.nextLine();
                while (true){
                    String line = sc.nextLine();
                    if(line.equals("끝")){
                        break;
                    }
                    List.add(line);
                }
                //출력하기
                System.out.println("[ " + form + "으로 저장된 " + title + " ]");
                for (int inputNum = 0; inputNum<List.size(); inputNum++){
                    int num = inputNum+1;
                    String strNum = num +". ";
                    System.out.println(strNum + List.get(inputNum));
                }
                break;

            //Set
            case "Set" : LinkedHashSet<String> Set = new LinkedHashSet<>();
                //저장하기
                title = sc.nextLine();
                while (true){
                    String line = sc.nextLine();
                    if(line.equals("끝")){
                        break;
                    }
                    Set.add(line);
                }
                //출력하기
                System.out.println("[ " + form + "으로 저장된 " + title + " ]");
                Iterator<String> integer = Set.iterator();
                for (int inputNum = 0; inputNum<Set.size();inputNum++){
                    int num = inputNum+1;
                    String strNum = num+". ";
                    System.out.println(strNum + integer.next());
                }
                break;

            //Map
            case "Map" : Map<Integer, String> Map = new HashMap<>();
                //저장하기
                title = sc.nextLine();
                int intNum =1;
                while (true){
                    String line = sc.nextLine();
                    if(line.equals("끝")){
                        break;
                    }
                    Map.put(intNum++, line);
                }
                //출력하기
                System.out.println("[ " + form + "으로 저장된 " + title + " ]");
                for(int num=0;num<Map.size();num++){
                    String strNum = (num+1)+". ";
                    System.out.println(strNum + Map.get(num+1));
                }
                break;

            //잘못된 입력
            default : System.out.println("자료구조형을 정확히 입력해 주세요");
        }
    }
}