import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainManagementAppTest {

    @Test
    void validCargoAssignmentShouldPass() {
        GoodsBogie bogie = new GoodsBogie("Cylindrical");

        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }

    @Test
    void invalidCargoAssignmentShouldThrowException() {
        CargoSafetyException exception = assertThrows(
                CargoSafetyException.class,
                () -> {
                    GoodsBogie bogie = new GoodsBogie("Rectangular");
                    bogie.assignCargo("Petroleum");
                }
        );

        assertEquals(
                "Petroleum cannot be assigned to a rectangular bogie.",
                exception.getMessage()
        );
    }
}