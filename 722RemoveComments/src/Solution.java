/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean blockFlag = false;
        StringBuilder sb = new StringBuilder();

        for (String iter: source){
            if (blockFlag == false)
                sb = new StringBuilder();

            for (int i=0;i<iter.length();i++){
                if (i+1 < iter.length()) {
                    if (iter.charAt(i) == '/' && iter.charAt(i + 1) == '/') {
                        i++;
                        if (blockFlag == false){
                            break;
                        }
                    } else if (iter.charAt(i) == '/' && iter.charAt(i + 1) == '*') {
                        if (blockFlag == false) {
                            blockFlag = true;
                            for (int j = i + 2; j < iter.length(); j++) {
                                if (j < iter.length() && j + 1 < iter.length()) {
                                    if (iter.charAt(j) == '*' && iter.charAt(j + 1) == '/') {
                                        i = j + 1;
                                        blockFlag = false;
                                        break;
                                    }
                                }
                            }
                            if (blockFlag == true)
                                break;
                        }
                        else{
                            continue;
                        }
                    } else if (iter.charAt(i) == '*' && iter.charAt(i + 1) == '/') {
                        if (blockFlag == true) {
                            i++;
                            blockFlag = false;
                        }
                        else{
                            sb.append(iter.charAt(i));
                        }
                    } else {
                        if (blockFlag == false)
                            sb.append(iter.charAt(i));
                    }
                }
                else{
                    if (blockFlag == false)
                        sb.append(iter.charAt(i));
                }
            }

            String temp = sb.toString();
            if (sb.toString().equals(""))
                continue;

//            for (int k = 0; k<temp.length()-1;k++) {
//                if (temp.charAt(k) != ' ') {
//                    result.add(temp);
//                    break;
//                }
//            }

            if (blockFlag == false)
                result.add(temp);
        }

        return result;
    }
}
