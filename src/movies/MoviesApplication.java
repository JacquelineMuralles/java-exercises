//package movies;
//
//import util.Input;
//
//import java.util.Scanner;
//
//public class MoviesApplication  {
//        final static String[] categories = {"none", "all", "animated", "drama", "horror", "scifi", "musical", "comedy"}
//
//
//    public static void main(String[] args) throws Exception{
//        Input input = new Input();
//        Scanner scanner = new Scanner(System.in);
//        Input.setScanner(scanner);
//        Movie[] movieList = MoviesArray.findAll();
//
//        int choice;
//        do{
//            System.out.println();
//            System.out.println("What would you like to do?");
//            System.out.println("");
//            System.out.println(("0 - exit"));
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//            System.out.println("6 - view movies in the musical category");
//            System.out.println("7 - view movies in the comedy category");
//            System.out.println("8 - add movie");
//            System.out.println("");
//            System.out.println("Enter your choice: ");
//
//            choice = Input.getInt(0, 8, "Enter your choice: ");
//
//            //set up switch statement to choose what to display / do
//            if(choice != 0 && choice != 8){
//                //iterate through all movies and print them out based on choice
//                for(Movie movie : movieList){
//                    switch (choice){
//                        case 1:
//                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
//                            break;
//                        case 2:
//                        case 3:
//                        case 4:
//                        case 5:
//                        case 6:
//                        case 7:
//                            if(movie.getCategory().equalsIgnoreCase(categories[choice])){
//                                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//            if(choice == 8){
//                movieList = addMovie(movieList);
//            }
//
//        } while (choice != 0);
//        System.out.println("Goodbye!");
//    }
//
//    private static Movie[] addMovie(Movie[] movieList) throws Exception{
//            String name = Input.getString("Enter the movie name: ");
//            String category = Input.getString("Enter the movie category: );
//
//            Movie newMovie = new Movie (name, )
//    }
//}
