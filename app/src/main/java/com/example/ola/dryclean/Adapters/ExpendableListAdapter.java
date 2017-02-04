package com.example.ola.dryclean.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.example.ola.dryclean.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ola on 1/24/2017.
 */

public class ExpendableListAdapter extends BaseExpandableListAdapter {
    private Context _context ;
    private List<String> _listDataHeader ;
    private HashMap<String, List<String>> _listDataChild;


    public ExpendableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }


    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }


    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }


    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }


    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.childs, null);
        }

//        TextView txtListChild = (TextView) convertView.findViewById(R.id.wintertxt);
//        TextView txtListChild = (TextView) convertView.findViewById(R.id.wintertxt);
//        TextView txtListChild = (TextView) convertView.findViewById(R.id.wintertxt);
//        TextView txtListChild = (TextView) convertView.findViewById(R.id.wintertxt);

//        txtListChild.setText(childText);
        return convertView;
    }





    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
