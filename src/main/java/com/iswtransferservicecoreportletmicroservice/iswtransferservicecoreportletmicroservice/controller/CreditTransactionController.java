package com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.controller;



import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.service.impl.CreditTransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

@RestController
@RequestMapping("creditTransactions/api/v1/")
public class CreditTransactionController {

    @Autowired
    private CreditTransactionServiceImpl creditTransactionServiceImpl;

    public CreditTransactionController() {
    }

    @GetMapping("/transaction/reference/{transactionReference}")
    public @ResponseBody
    Object getTransactionByReference(@PathVariable String transactionReference) {
        return creditTransactionServiceImpl.getTransactionByTransactionReference(transactionReference);
    }

    @GetMapping("/transaction/clientreference/{clientRef}")
    public @ResponseBody
    Object getTransactionByClientReference(@PathVariable String clientRef) {
        Object response = creditTransactionServiceImpl.getTransactionByClientRef(clientRef);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(path = "/transactions/filters/",method = RequestMethod.POST )
    public @ResponseBody
    Object getTransactionByFilter(@RequestParam(name = "initiatingInstitutionCode") String initiatingInstitutionCode,
                                  @RequestParam(name = "destinationInstitutionCode") String destinationInstitutionCode,
                                  @RequestParam(name = "inquiryDateTime") String inquiryDateTime,
                                  @RequestParam(name = "creditDateTime") String creditDateTime,
                                  @RequestParam(name = "status") String status,
                                  @RequestParam(name = "terminalId") String terminalId,
                                  @RequestParam(name = "channel") String channel) {

        Object response = creditTransactionServiceImpl.getTransactionByFilterParameters(
                initiatingInstitutionCode,
                destinationInstitutionCode,
                inquiryDateTime,
                creditDateTime,
                status,
                terminalId,
                channel);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(path = "/transactions/filters", method = RequestMethod.POST )
    @ResponseBody
    public Object test(@RequestParam(name = "initiatingInstitutionCode") String initiatingInstitutionCode,
                       @RequestParam(name="destinationInstitutionCode") String destinationInstitutionCode,
                       @RequestParam(name = "inquiryDateTime") String inquiryDateTime,
                       @RequestParam(name = "creditDateTime") String creditDateTime,
                       @RequestParam(name = "status") String status,
                       @RequestParam(name = "terminalId") String terminalId,
                       @RequestParam(name = "channel") String channel
                       ){

        Object response = creditTransactionServiceImpl.getTransactionByFilterParameters(
                initiatingInstitutionCode,
                destinationInstitutionCode,
                inquiryDateTime,
                creditDateTime,
                status,
                terminalId,
                channel);
        return response;
    }
}
