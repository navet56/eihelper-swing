package model;

import utils.observer.Observable;
import view.AppView;

/**
 * The type App model.
 */
public class AppModel extends Observable<AppView, AppModel> {
    private MenuPage actualPage;

    /**
     * Instantiates a new App model.
     */
    public AppModel() {
        this.actualPage = MenuPage.TRAINING;
    }

    /**
     * Notify an observer about the whole state of the app.
     * This method should generally be used to initialize this observer.
     *
     * @param observer the observer
     */
    @Override
    protected void notifyUpdateEverything(AppView observer) {
        observer.updateEverything(this);
    }

    /**
     * Gets actual page.
     *
     * @return the actual page
     */
    public MenuPage getActualPage() {
        return this.actualPage;
    }

    /**
     * Sets actual page.
     *
     * @param actualPage the actual page
     */
    public void setActualPage(MenuPage actualPage) {

        this.actualPage = actualPage;
    }
}
