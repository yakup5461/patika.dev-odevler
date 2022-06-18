package java102.FixtureBuilder;

import java.util.*;

public class FixtureBuilder {

    public static void main(String[] args) {
	
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ligdeki Takım Sayısını Giriniz : ");
        int amount = scanner.nextInt();


        List<String> teams = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            System.out.print((i+1)+". Takım : " );
            String teamName =scanner.next();
            if(!teams.contains( teamName)) {
            	teams.add(teamName);
            	
            }else {
            System.out.println("Girdiğiniz takım bulunmaktadır. Farklı bir takım giriniz !");
            i--;}
        }
        
        if (amount%2 != 0){
            teams.add("Bay");
            amount++;
        }

        List<String> tempTeams = new ArrayList<>();
        for(int i = 0; i < amount; i++){
            int rnValue = random.nextInt(teams.size());
            tempTeams.add(teams.get(rnValue));
            teams.remove(teams.get(rnValue));
        }
        System.out.println("======================================================");
        teams=tempTeams;
        int totalRound=amount-1;
        int numMatchPerRound=amount/2;
        int index=random.nextInt(teams.size());
        String fixTeam=teams.get(index);
        teams.remove(teams.get(index));
        
        for (int i=1;i<=2*totalRound;i++){
            if (i<=totalRound){System.out.println("------------- "+i+". Round"+"-------------");
            
                System.out.println(fixTeam+" vs "+teams.get(0));
                for (int j=1;j<=numMatchPerRound-1;j++){
                    System.out.println(teams.get(j)+" vs "+teams.get(teams.size()-j));
                }
                List<String> newList=new ArrayList<>();
                newList.add(teams.get(teams.size()-1));

                for(int k=0;k<teams.size()-1;k++){
                    newList.add(teams.get(k));
                }
                teams=newList;
            }else {
                System.out.println("------------- "+i+". Round"+"-------------");
                System.out.println(teams.get(0)+" vs "+fixTeam);
                for (int j=1;j<=numMatchPerRound-1;j++){
                    System.out.println(teams.get(teams.size()-j)+" vs "+teams.get(j));
                }
                List<String> newList=new ArrayList<>();
                newList.add(teams.get(teams.size()-1));

                for(int k=0;k<teams.size()-1;k++){
                    newList.add(teams.get(k));
                }
                teams=newList;
            }
        }
    scanner.close();
    }
}