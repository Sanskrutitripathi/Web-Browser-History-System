import java.util.Scanner;
import java.util.Stack;

public class WebBrowserHistory 
{
    static Stack<String> history = new Stack<>();
    static Stack<String> fhistory = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println();
            System.out.println("-----MENU-----");
            System.out.println("1. Visit Page");
            System.out.println("2. Go backward");
            System.out.println("3. Go forward");
            System.out.println("4. View history");
            System.out.println("5. Clear history");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                {
                    visitPage();
                    break;
                }
                    
                case 2:
                {
                    goBackward();
                    break;
                }
                    
                case 3:
                {
                    goForward();
                    break;
                }
                case 4:
                {
                    viewHistory();
                    break;
                } 
                case 5:
                {
                    clearHistory();
                    break;
                }
                case 6:
                {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please choose a valid option from MENU.");
            }
        }
    }

    static void visitPage()
    {
        boolean validURL = false;
        String url;
        
        do 
        {
            System.out.println("Enter the URL of the page you want to visit: ");
            url = sc.next();
    
            if (isValidURL(url)) 
            {
                validURL = true;
                history.push(url);
                fhistory.clear(); 
                System.out.println("Visited page: " + url);
            } 
            else 
            {
                System.out.println("Invalid URL. Please enter a valid URL starting with http:// or https://");
            }
    
        } 
        while (!validURL);
    }

    static void goBackward() 
    {
        System.out.println("Going a page backward");
        if(history.isEmpty())
        {
            System.out.println("Sorry! No pages to go back");
        }
        else
        {
            fhistory.push(history.pop());
            if(history.isEmpty())
            {
                System.out.println("sorry! no pages to go back");
                System.out.println("Back to Home page");
            }
            else
            {
                System.out.println("Back to page: "+history.peek());
            }
        }
    }

    static void goForward() 
    {
        System.out.println("Going a page forward");
        if(fhistory.isEmpty())
        {
            System.out.println("Sorry! No pages to go forward");
        }
        else
        {
            history.push(fhistory.pop());
            System.out.println("Forward to page: " + history.peek());
        }
    }

    static void viewHistory() 
    {
        System.out.println("Viewing history");
        if(history.isEmpty())
        {
            System.out.println("No history found");
            System.out.println("You have not visited any pages");
        }
        else
        {
            System.out.println("Pages you visited:");
            int i=1;
            for(String urls : history)
            {
                System.out.println("URL"+i+": "+urls);
                i++;
            }
        }
    }

    static void clearHistory() 
    {
        history.clear();
        fhistory.clear();
        System.out.println("Your browse history cleared successfully");
    }

    static boolean isValidURL(String urlString) 
    {
        return urlString.startsWith("http://") || urlString.startsWith("https://");
    }
}


