package pattern.behavioral.tempMethod.web;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();
        welcomePage.showPage();
        System.out.println("\n================================\n");
        newsPage.showPage();
    }
}
