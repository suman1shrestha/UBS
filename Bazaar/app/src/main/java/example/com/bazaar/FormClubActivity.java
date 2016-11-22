package example.com.bazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FormClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_club);
    }

    protected void openSendInvite(View view)
    {
        Intent intent = new Intent(this, SendGroupInvitationActivity.class);
        startActivity(intent);
    }
}
