package com.example.cse.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class SampleWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appwidget:appWidgetIds){
            Intent intent=new Intent(context,MainActivity.class);
            PendingIntent pi=PendingIntent.getActivity(context,1,intent,0);
            RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.widgetdesign);
            views.setOnClickPendingIntent(R.id.widgets,pi);
            appWidgetManager.updateAppWidget(appwidget,views);

        }
    }
}
