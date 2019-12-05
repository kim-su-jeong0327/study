package com.example.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,Mode{

    public Button login,write,delete,read,manage;
    public Button [] BtnArray = new Button[5];
    public EditText member;
    public TextView mode;
    public Boolean w,d,r,m;
    public String mkind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();

//        onWrite(true);
//        onDelete(true);
//        onRead(true);
//        onManagement(true);
    }

    private void initGUI(){

        for (int i = 0; i<5;i++){
            BtnArray[i] = (Button)findViewById(R.id.button +i);
            BtnArray[i].setOnClickListener(this);
        }
       mode = (TextView)findViewById(R.id.textView1);
        member = (EditText)findViewById(R.id.editText);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button1 :
                    mode.setText("글쓰기");
                break;
            case R.id.button2 :
                mode.setText("삭제");

                break;
            case R.id.button3 :
                    mode.setText("읽기");
                break;
            case R.id.button4 :
                    mode.setText("관리");
                break;

            case R.id.button :
                if (member != null){
                    mkind = member.getText().toString();
                    if (mkind != null){
                        switch (mkind){
                            case "general" :
                                General_member general_member= new General_member(this);
                                general_member.onMode();
                                break;

                            case"full" :
                                Full_member full_member = new Full_member(this);
                                full_member.onMode();
                                break;

                            case "manager" :
                                Manage_member manage_member= new Manage_member(this);
                                manage_member.onMode();
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

    @Override
    public void write(Boolean w) {
        write.setEnabled(w);
    }

    @Override
    public void delete(Boolean d) {
        delete.setEnabled(d);
    }

    @Override
    public void read(Boolean r) {
        read.setEnabled(r);
    }

    @Override
    public void manage(Boolean m) {
        manage.setEnabled(m);
    }
}
