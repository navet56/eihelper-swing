package controller;

import model.AppModel;
import model.MenuPage;

import java.awt.event.ActionListener;

/**
 * The type App controller.
 */
public class AppController {
    private final AppModel appModel;

    /**
     * Instantiates a new App controller.
     *
     * @param appModel the app model
     */
    public AppController(AppModel appModel) {
        this.appModel = appModel;
    }

    /**
     * Gets previous page listener.
     *
     * @return the previous page listener
     */
    public ActionListener getPreviousPageListener() {
        return e -> this.appModel.goPreviousPage();
    }

    /**
     * Gets chat listener.
     *
     * @return the chat listener
     */
    public ActionListener getChatListener() {
        return e -> this.appModel.setActualPage(MenuPage.CHAT);
    }

    /**
     * Gets map listener.
     *
     * @return the map listener
     */
    public ActionListener getMapListener() {
        return e -> this.appModel.setActualPage(MenuPage.MAP);
    }

    /**
     * Gets planning listener.
     *
     * @return the planning listener
     */
    public ActionListener getPlanningListener() {
        return e -> this.appModel.setActualPage(MenuPage.PLANNING);
    }

    /**
     * Gets training listener.
     *
     * @return the training listener
     */
    public ActionListener getSettingsListener() {
        return e -> this.appModel.setActualPage(MenuPage.SETTINGS);
    }

    /**
     * Gets training listener.
     *
     * @return the training listener
     */
    public ActionListener getTrainingListener() {
        return e -> this.appModel.setActualPage(MenuPage.TRAINING);
    }
}
