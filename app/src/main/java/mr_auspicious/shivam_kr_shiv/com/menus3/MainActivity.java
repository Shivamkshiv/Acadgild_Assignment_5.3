package mr_auspicious.shivam_kr_shiv.com.menus3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding the values in our Array List...
        ArrayList<Info> information = new ArrayList<>();
        information.add(new Info("Ish","11111111"));
        information.add(new Info("Kumar","2222222222"));
        information.add(new Info("Shyam","4455756767"));
        information.add(new Info("Ram", "34642653"));
        information.add(new Info("Rakesh","76756645"));
        information.add(new Info("Ram"," 967564764"));
        information.add(new Info("Rajesh","6756464"));

        ListView listView = (ListView) findViewById(R.id.list); // Defining the listview
        InfoAdapter infoAdapter = new InfoAdapter(getBaseContext(),information);
        listView.setAdapter(infoAdapter); //Setting the adapter to our listview ...

        registerForContextMenu(listView); //Registering the listview for Context Menu...

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action"); //sets the title to "Select The Action"..

        //Adding the menu options...
        menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "SMS");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(),"Calling...",Toast.LENGTH_LONG).show(); //prints this toast when u click on this option
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"Sending...",Toast.LENGTH_LONG).show(); //prints this toast when u click on this option
        }else{
            return false;
        }
        return true;
    }


}
