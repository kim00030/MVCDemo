package mvcdemo.owner.mvcdemo.main.mainmodule.mainpages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mvcdemo.owner.mvcdemo.R;


/**
 * This plays main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mainPresenter = new MainPresenter(this);
    }

    ///////The below is MvpView methods/////////////////////////////////////////////
    @Override
    public void showSignInScreen() {

        Toast.makeText(this,"showSignInScreen",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"showSignUpScreen",Toast.LENGTH_SHORT).show();
    }

    public void doAction(View view) {

        switch(view.getId()){

            case R.id.btnSignIn:
                mainPresenter.signInButtonClick();
                break;

            case R.id.btnSignOut:
                mainPresenter.signUpButtonClick();
                break;
        }

    }
}
