package mvcdemo.owner.mvcdemo.main.mainmodule.mainpages;

/**
 * Responsible for handling actions from the View {@link MainActivity} and updating the UI as required
 */

public class MainPresenter implements MainContract.Presenter{

    private MainContract.MvpView view;

    public MainPresenter(MainContract.MvpView view){
        this.view = view;
    }

    //////////The below is Presenter methods////////////////////////
    @Override
    public void signInButtonClick() {

        view.showSignInScreen();
    }

    @Override
    public void signUpButtonClick() {
        view.showSignUpScreen();
    }
}
