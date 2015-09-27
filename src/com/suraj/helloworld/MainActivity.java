package com.suraj.helloworld;

import android.os.Bundle;
import android.app.Activity;

import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity 
implements OnClickListener  

{
	
	Button login,signup,clear;
	EditText usernameText,passwordText;
	String Actualname="user";
	String Actualpassword="1234";
	String enterUsername;
	String enterPassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        login=(Button)findViewById(R.id.buttonLogin);
        clear=(Button)findViewById(R.id.buttonClear);
        signup=(Button)findViewById(R.id.buttonSignup);
        
        usernameText=(EditText)findViewById(R.id.editTextUser);
        passwordText=(EditText)findViewById(R.id.editTextPass);
        
      login.setOnClickListener(this);
      signup.setOnClickListener(this);
      
       /* signup.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View arg0){
        		Log.d("DEBU","signup");
        		
        	}
        }); */
     
    
    clear.setOnClickListener(new OnClickListener() {
    	@Override
    	public void onClick(View arg0){
    		usernameText.setText("");
        	passwordText.setText("");
    	}
    });}
    
    @Override
    public void onClick(View arg0)
    {
    	enterUsername=usernameText.getText().toString();
    	enterPassword=passwordText.getText().toString();
    	
    	if(Actualname.equalsIgnoreCase(enterUsername) && Actualpassword.equalsIgnoreCase(enterPassword))
    	{
    		Log.d("DEBU","Successfully login");
    		Toast.makeText(this, "Successfully login", Toast.LENGTH_SHORT).show();
    	}
    	else
    	{
    		Log.d("DEBU","login failed");
    		Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
    	}
    	
  } 

	

    
}
