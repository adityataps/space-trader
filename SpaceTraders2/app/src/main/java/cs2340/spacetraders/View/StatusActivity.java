package cs2340.spacetraders.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.Arrays;

import cs2340.spacetraders.Model.Goods;
import cs2340.spacetraders.R;
import cs2340.spacetraders.ViewModel.MarketViewModel;
import cs2340.spacetraders.ViewModel.PlayerViewModel;

/*
The screen with the buy and sell buttons
 */
public class StatusActivity extends AppCompatActivity {

    private TextView playerName;
    private TextView points;
    private TextView location;
    private TextView ship;
    private TextView cargoSpace;
    private TextView fuel;

    public PlayerViewModel playerViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        playerName = findViewById(R.id.player_name);
        location = findViewById(R.id.location);
        points = findViewById(R.id.points);
        ship = findViewById(R.id.ship);
        cargoSpace = findViewById(R.id.cargo_space);
        fuel = findViewById(R.id.fuel);

        playerName.setText(playerViewModel.getPlayer().getName());
        points.setText(Integer.toString(playerViewModel.getPlayer().getCredits()));
        location.setText(Integer.toString(playerViewModel.getPlayer().getCredits()));
        ship.setText(playerViewModel.getPlayer().getShip().getShiptype().getName());
        cargoSpace.setText(Integer.toString(playerViewModel.getPlayer().getShip().getCargo().getCargoCapacity()));
        fuel.setText(Integer.toString(playerViewModel.getPlayer().getFuel()));



    }

}
