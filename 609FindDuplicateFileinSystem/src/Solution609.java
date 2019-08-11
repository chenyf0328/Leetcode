/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution609 {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String iter: paths){
            String[] iterSplit = iter.split(" ");

            for (int i=1;i<iterSplit.length;i++){
                Pattern p = Pattern.compile("(?<=\\()(\\S+)(?=\\))");
                Matcher m = p.matcher(iterSplit[i]);
                while (m.find()){
                    String content = m.group();
                    String filePath = iterSplit[0] + "/" + iterSplit[i].split("\\(")[0];
                    if (map.containsKey(content)){
                        map.get(content).add(filePath);
                    }
                    else{
                        List<String> filePathList = new ArrayList<>();
                        filePathList.add(filePath);
                        map.put(content, filePathList);
                    }
                }
            }
        }

        for (HashMap.Entry<String, List<String>> entry : map.entrySet()){
            if (entry.getValue().size() > 1)
                result.add(entry.getValue());
        }

        return result;
    }
}
