package antifraud;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService service = new TransactionService();
    @PostMapping("/api/antifraud/transaction")
    public ResponseEntity<?> postTransaction(@RequestBody Transaction transaction) {
        return service.postTransaction(transaction);
    }
}
