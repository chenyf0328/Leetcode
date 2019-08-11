/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief      
 *
 *  \param     
 *
 *  \returns        
 */

public class TryEnum {

    public enum Color {
        RED, GREEN, BLACK, YELLOW
    }

    public static void main(String[] args){
        Color c[] = Color.values();
        System.out.println(c[2]);
    }
}
