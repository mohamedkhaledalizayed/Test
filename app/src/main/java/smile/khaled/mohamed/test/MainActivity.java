package smile.khaled.mohamed.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import smile.khaled.mohamed.prettytoastlibrary.FailedToast;
import smile.khaled.mohamed.prettytoastlibrary.InfoToast;
import smile.khaled.mohamed.prettytoastlibrary.SuccessToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void successToast(View view) {
        new SuccessToast(this,"The Data Updated Successfully");
    }

    public void infoToast(View view) {
        new InfoToast(this,"This Is Info Toast");
    }

    public void failedToast(View view) {
        new FailedToast(this,"The Data not updated");
    }

}
