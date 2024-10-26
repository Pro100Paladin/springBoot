package ru.medvedev.timesheet.aspect;

import org.springframework.stereotype.Component;
import ru.medvedev.aspect.logging.Logging;

@Component
public class RecoverAspectTest {
    @Logging
    @Recover
    public Integer getIntegerValue() {
        System.out.println(1 / 0);
        return 0;
    }

//    @Logging
//    @Recover
//    public int getIntValue() {
//        System.out.println(1 / 0);
//        return 0;
//    }
//
//    @Logging
//    @Recover
//    public Optional<?> getOptionalValue() {
//        System.out.println(1 / 0);
//        return Optional.empty();
   // }
}
