package org.bookdash.android.presentation.settings;

import org.bookdash.android.presentation.base.MvpPresenter;
import org.bookdash.android.presentation.base.MvpView;

/**
 * @author rebeccafranks
 * @since 2016/12/21
 */
public interface SettingsContract {

    interface View extends MvpView {

        void showHelpTutorial();

    }

    interface Presenter extends MvpPresenter<View> {

        void clickShowTutorial();

        void turnBookUpdatesNotificationOff();

        void turnAppUpdateNotificationsOff();

        void turnBookUpdatesNotificationOn();

        void turnAppUpdateNotificationsOn();
    }
}
