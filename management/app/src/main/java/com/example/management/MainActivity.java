package com.example.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText member,mode;
    private Button login,write,delete,read,management;
    public String mkind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();

        onWrite(true);
        onDelete(true);
        onRead(true);
        onManagement(true);
    }

    private void initGUI(){
        login = (Button)findViewById(R.id.login);
        write = (Button)findViewById(R.id.write);
        delete = (Button)findViewById(R.id.delete);
        read = (Button)findViewById(R.id.read);
        management = (Button)findViewById(R.id.management);

        member = (EditText)findViewById(R.id.member);
        mode = (EditText)findViewById(R.id.mode);

        write.setOnClickListener(this);
        delete.setOnClickListener(this);
        read.setOnClickListener(this);
        management.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    public void onWrite(Boolean TFw){
        if (TFw != null){
            write.setEnabled(TFw);
        }
    }

    public void onDelete(Boolean TFd){
        if (TFd != null){
            delete.setEnabled(TFd);
        }
    }

    public void onRead(Boolean TFr){
        if (TFr != null){
            read.setEnabled(TFr);
        }
    }

    public void onManagement(Boolean TFm){
        if (TFm != null){
            management.setEnabled(TFm);
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.write :
                mode.setText("글쓰기");
                break;
            case R.id.delete :
                mode.setText("삭제");
                break;
            case R.id.read :
                mode.setText("읽기");
                break;
            case R.id.management :
                mode.setText("관리");
                break;

            case R.id.login :
                if (member != null){
                    mkind = member.getText().toString();
                    if (mkind != null){
                        switch (mkind){
                            case "amember" :
                                A_member a = new A_member(this);
                                a.onMode();
                                break;

                            case"fmember" :
                                F_member f = new F_member(this);
                                f.onMode();
                                break;

                            case "manager" :
                                Manager m = new Manager(this);
                                m.onMode();
                                break;

                                default:
                                    break;
                        }
                    }
                }
                break;

                default:
                    break;
        }
    }
}
