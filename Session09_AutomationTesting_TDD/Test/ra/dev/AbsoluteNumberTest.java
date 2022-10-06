package ra.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    void getAbsoluteNumberTest1() {
        //Xay dung du lieu dau vao
        int number = 1;
        //Ket qua mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected = 1;
        //Ket qua thuc te nhan dau sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        //Thuc hien so sanh ket qua mong doi voi ket qua thuc te
        assertEquals(exspected,result);
    }
    @Test
    void getAbsoluteNumberTest2() {
        //Xay dung du lieu dau vao
        int number = 0;
        //Ket qua mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected = 0;
        //Ket qua thuc te nhan dau sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        //Thuc hien so sanh ket qua mong doi voi ket qua thuc te
        assertEquals(exspected,result);
    }
    @Test
    void getAbsoluteNumberTest3() {
        //Xay dung du lieu dau vao
        int number = -1;
        //Ket qua mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected = 1;
        //Ket qua thuc te nhan dau sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        //Thuc hien so sanh ket qua mong doi voi ket qua thuc te
        assertEquals(exspected,result);
    }
}