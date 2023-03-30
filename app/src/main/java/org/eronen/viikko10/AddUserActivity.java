package org.eronen.viikko10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText textFirstName;
    private EditText textLastName;
    private EditText textEmail;
    private CheckBox cbKandi, cbDiplomi, cbTohtori, cbUima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        textFirstName = findViewById(R.id.editTextFirstName);
        textLastName = findViewById(R.id.editTextLastName);
        textEmail = findViewById(R.id.editTextEmail);
        cbKandi = findViewById(R.id.cbKandi);
        cbDiplomi = findViewById(R.id.cbDiplomi);
        cbTohtori = findViewById(R.id.cbTohtori);
        cbUima = findViewById(R.id.cbUima);

    }

    public void addUser(View view) {

        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);
        User user = null;

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                user = new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Tietotekniikka");
                if (cbKandi.isChecked()) {
                    user.addDegree("Kandidaatin tutkinto");
                }
                if (cbDiplomi.isChecked()) {
                    user.addDegree("Diplomi-insinöörin tutkinto");
                }
                if (cbTohtori.isChecked()) {
                    user.addDegree("Tohtorin tutkinto");
                }
                if (cbUima.isChecked()) {
                    user.addDegree("Uimamaisteri");
                }
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbTuotantotalous:
                user = new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Tuotantotalous");
                if (cbKandi.isChecked()) {
                    user.addDegree("Kandidaatin tutkinto");
                }
                if (cbDiplomi.isChecked()) {
                    user.addDegree("Diplomi-insinöörin tutkinto");
                }
                if (cbTohtori.isChecked()) {
                    user.addDegree("Tohtorin tutkinto");
                }
                if (cbUima.isChecked()) {
                    user.addDegree("Uimamaisteri");
                }
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbLaskennallinen:
                user = new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Laskennallinen tekniikka");
                if (cbKandi.isChecked()) {
                    user.addDegree("Kandidaatin tutkinto");
                }
                if (cbDiplomi.isChecked()) {
                    user.addDegree("Diplomi-insinöörin tutkinto");
                }
                if (cbTohtori.isChecked()) {
                    user.addDegree("Tohtorin tutkinto");
                }
                if (cbUima.isChecked()) {
                    user.addDegree("Uimamaisteri");
                }
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbSähkötekniikka:
                user = new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Sähkötekniikka");
                if (cbKandi.isChecked()) {
                    user.addDegree("Kandidaatin tutkinto");
                }
                if (cbDiplomi.isChecked()) {
                    user.addDegree("Diplomi-insinöörin tutkinto");
                }
                if (cbTohtori.isChecked()) {
                    user.addDegree("Tohtorin tutkinto");
                }
                if (cbUima.isChecked()) {
                    user.addDegree("Uimamaisteri");
                }
                UserStorage.getInstance().addUser(user);
                break;
        }

        UserStorage.getInstance().saveUsers(this);

    }

}