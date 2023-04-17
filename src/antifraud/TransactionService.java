package antifraud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TransactionService {
    public ResponseEntity<?> postTransaction(Transaction transaction) {
        long amount = transaction.getAmount();
        if (amount <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        String response;
        if (amount <= 200) {
           response = TransactionStatus.ALLOWED.toString();
        } else if (amount <= 1500) {
            response = TransactionStatus.MANUAL_PROCESSING.toString();
        } else {
            response = TransactionStatus.PROHIBITED.toString();
        }

        return new ResponseEntity<>(Map.of("result", response), HttpStatus.OK);

    }
}
