package model;

import utils.observer.Observable;
import view.AppView;

import java.util.ArrayList;
import java.util.List;

/**
 * The type App model.
 */
public class AppModel extends Observable<AppView, AppModel> {
    private final List<MenuPage> breadcrumb = new ArrayList<>();

    /**
     * Instantiates a new App model.
     */
    public AppModel() {
        this.breadcrumb.add(MenuPage.CARTE);
    }

    /**
     * Go previous page.
     */
    public void goPreviousPage() {
        if (this.breadcrumb.size() > 1) {
            this.breadcrumb.remove(this.breadcrumb.size() - 1);
            this.notifyUpdateEverything();
        }
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
        if (this.breadcrumb.isEmpty()) {
            this.breadcrumb.add(MenuPage.CARTE);
        }
        return this.breadcrumb.get(this.breadcrumb.size() - 1);
    }

    /**
     * Sets actual page.
     *
     * @param actualPage the actual page
     */
    public void setActualPage(MenuPage actualPage) {
        if (this.getActualPage() != actualPage) {
            this.breadcrumb.add(actualPage);
            this.notifyUpdateEverything();
        }
    }
}
