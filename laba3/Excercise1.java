package laba3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Excercise1 {
    public static void main(String[] args) {
        List<Laptop> laptopsList = createLaptops(7);
        laptopsList.forEach(System.out::println);
        HashMap<Integer, String> search = getCryteria();
        Integer criteria = (Integer) search.keySet().toArray()[0];
        List<Laptop> searched = new ArrayList<>();
        switch (criteria){
            case 1: searched = laptopsList.stream().filter(l -> l.getRam()>=Integer.parseInt(search.get(criteria))).collect(Collectors.toList());
                break;

            case 2: searched = laptopsList.stream().filter(l -> l.getDiagonal()>=Double.parseDouble(search.get(criteria))).collect(Collectors.toList());
                break;

            case 3: searched = laptopsList.stream().filter(l -> l.getCompany().equals(search.get(criteria))).collect(Collectors.toList());
                break;

            case 4: searched = laptopsList.stream().filter(l -> l.getModel() == Integer.parseInt(search.get(criteria))).collect(Collectors.toList());
                break;

            case 5: searched = laptopsList.stream().filter(l -> l.getOs().equals(search.get(criteria))).collect(Collectors.toList());
                break;
            case 6: searched = laptopsList.stream().filter(l -> l.getColor().equals(search.get(criteria))).collect(Collectors.toList());
                break;
        }
        searched.forEach(System.out::println);
    }

    public static List<Laptop> createLaptops(int number){
        List<Integer> rams = Arrays.asList(4, 8, 16, 32);
        List<Double> diagonals = Arrays.asList(14.0, 15.6, 16.1, 17.3);
        List<String> companies = Arrays.asList("Dell", "Lenovo", "HP", "ASUS", "Acer", "Xiaomi", "Apple");
        OperationSystem[] oss = {OperationSystem.WINDOWS, OperationSystem.LINUX};
        List<String> color = Arrays.asList("black", "silver", "white", "blue", "red");
        Random rand = new Random();
        List<Laptop> list = new ArrayList<>();
        for (int i = 0; i < number; i++){
            list.add(new Laptop(
                    rams.get(rand.nextInt(rams.size())),
                    diagonals.get(rand.nextInt(diagonals.size())),
                    companies.get(rand.nextInt(companies.size())),
                    rand.nextInt(Integer.MAX_VALUE),
                    oss[rand.nextInt(oss.length)],
                    color.get(rand.nextInt(color.size()))
            ));
        }
        return list;
    }


    public static HashMap<Integer, String> getCryteria(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите критерий поиска: " +
                "1 - количество RAM, " +
                "2 - диагональ экрана, " +
                "3 - компания, " +
                "4 - модель, " +
                "5 - операционная система, " +
                "6 - цвет");
        int criteria = Integer.parseInt(sc.nextLine());
        System.out.println("введите значение критерия");
        String value = sc.nextLine();
        HashMap<Integer, String> search = new HashMap<>();
        search.put(criteria, value);
        return search;
    }

}