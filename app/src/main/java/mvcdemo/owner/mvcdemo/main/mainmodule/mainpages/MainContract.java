package mvcdemo.owner.mvcdemo.main.mainmodule.mainpages;

/**
 * Define the contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}
 */

public interface MainContract {

    //for View
    interface MvpView{

        void showSignInScreen();
        void showSignUpScreen();
    }
    //for Presenter
    interface Presenter{

        void signInButtonClick();
        void signUpButtonClick();

    }

}
