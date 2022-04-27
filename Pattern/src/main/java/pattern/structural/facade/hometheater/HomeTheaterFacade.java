package pattern.structural.facade.hometheater;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

//Фасад домашнего кинотеатра
public class HomeTheaterFacade {
    Ampliefier ampliefier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    Screen screen;
    PopPopper popPopper;

    public HomeTheaterFacade(Ampliefier ampliefier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, Screen screen, PopPopper popPopper) {
        this.ampliefier = ampliefier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.popPopper = popPopper;
    }

    public void watchMovie(String movie){

    }

    public void endMovie(){

    }
}
