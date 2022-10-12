/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhutdm.mathutil.core;

/**
 *
 * @author ASUS
 */

//Ta sẽ clone thư viện/công cụ Math util của JDK
//giả lập khách hàng của class Math của JDK
//Những gì là công cụ dùng cho hàm khác, class khác thì thường sẽ được thiết kế là Static
//STATIC LÀ CHẤM TRỰC TIẾP QUA TÊN CLASS, KHÔNG CÓ NEW.
public class MathUtil {
    
    public static final double PI = 3.14;
    
    //Hàm tính n giai thừa
    //Quy ước:
    //không có giai thừa cho số âm
    //0! = 1! = 1
    //21! vượt 18 số 0, vượt kiểu long
    //hàm của chúng ta design chỉ chấp nhận tính giai thừa của n từ 0..20
    
    public static long getFractorial(int n)
    {
        long giaiThua = 1;
        if(n == 0)
            return 1;
        if(n < 0 || n > 20 )
            throw new IllegalArgumentException();
        for (int i = 1; i <= n ; i++) 
            giaiThua *= i;
        return giaiThua;
    }
    
    
}

//Kỹ thuật lập trình kiểu mới(vẫn giữ toàn bộ khái niệm cũ tới giờ)
//1 Plugin mới cho trình độ của dev - viết code chú ý luôn/cam kết code có chất lượng
//chất lượng không nói bằng miệng, chất lượng nói bằng code
//kỹ thuật TDD - Test Driven Deveplopment(TDD là tư duy viết code chứ không phải kỹ thuật viết code)
//Viết code và viết code để test code song song với nhau
//mỗi hàm dev viết ra phải viết ngay testcase, phải viết ngay hành động kiểm thử hàm
//để biết rằng hàm vừa viết chạy sai hay đúng
