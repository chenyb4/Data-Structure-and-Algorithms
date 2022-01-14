package com.company.algorithms;

import com.company.models.Client;
import com.company.models.Package;

import java.util.ArrayList;

public class Sort <T extends Comparable<T>>{

    //merge sort
    public void mergeSort(ArrayList<T> list){
        if(list.size() <2) return;
        int mid =list.size()/2;
        ArrayList<T> left = new ArrayList<>();
        ArrayList<T> right = new ArrayList<>();
        for(int i=0; i<mid; i++){
            left.add(list.get(i));
        }
        for(int i=0; i<list.size()-mid; i++){
            right.add(list.get(mid+i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, list);
    }

    // part of the merge sort for recursion
    private void merge (ArrayList<T> left, ArrayList<T> right, ArrayList<T> all){
        int i=0, j=0, k=0;
        while(i<left.size() && j< right.size()){
            //left.get(i).getId() < right.get(j).getId()
            if(left.get(i).compareTo(right.get(i))<0){
                all.set(k,left.get(i));
                i++;
            }else{
                all.set(k,right.get(j));
                j++;
            }
            k++;
        }
        while(i<left.size()){
            all.set(k++,left.get(i++));
        }
        while(j<right.size()){
            all.set(k++, right.get(j++));
        }
    }

    /**
     * Sort the objects using selection sort
     * @param clientList to be sorted
     * @param threshold when to stop the sorting
     */

    //selection sort
    public static void selectionSort(ArrayList<Client> clientList, int threshold) {
        for (int i = 0; i < threshold; i++) {
            int min_idx = i;
            for (int j = i + 1; j < clientList.size(); j++) {
                if (clientList.get(j).getNumberOfPackagesReceived() >= clientList.get(min_idx).getNumberOfPackagesReceived()) {
                    min_idx = j;
                }
            }
            Client temp = clientList.get(min_idx);
            clientList.set(min_idx, clientList.get(i));
            clientList.set(i, temp);
        }
    }
}
