package service.serviceImpl;

import service.ReverseService;

public class ReverseServiceImpl implements ReverseService {
    @Override
    public  String reverseString(String input) {
        StringBuilder reversed= new StringBuilder(input);
        reversed.reverse();
        return reversed.toString();
    }
}
