package com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.service.impl;

import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.mapper.RqCreditTransactionMapper;
import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.model.v1.CreditTransaction;
import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.rest.response.CreditTransactionResponse;
import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.service.CreditTransactionService;
import com.iswtransferservicecoreportletmicroservice.iswtransferservicecoreportletmicroservice.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service
public class CreditTransactionServiceImpl implements CreditTransactionService {

    @Autowired
    private DataSource dataSource;


    /**Get transaction using transaction reference
     * @param transactionRef
     * @return
     */
    @Override
    public Object getTransactionByTransactionReference(String transactionRef) {
      //return null;//  return this.creditTransactionRepository.getTransactionByTransactionReference(transactionRef);
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("getTransactionByTransactionRef")
                .withReturnValue()
                .returningResultSet("#result-set-1", BeanPropertyRowMapper.newInstance(CreditTransaction.class));//.returningResultSet(SINGLE_RESULT);

        SqlParameterSource in = new MapSqlParameterSource().addValue("ts_transactionReference",transactionRef);
        return getSingleTransactionDetails(jdbcCall, in);
    }


    /**Get transaction using client reference
     * @param clientRef
     * @return
     */
    @Override
    public Object getTransactionByClientRef(String clientRef) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("getTransactionByClientRef")
                .withReturnValue()
                .returningResultSet("#result-set-1", BeanPropertyRowMapper.newInstance(CreditTransaction.class));//.returningResultSet(SINGLE_RESULT);

        SqlParameterSource in = new MapSqlParameterSource().addValue("ts_clientRef",clientRef);
        return getSingleTransactionDetails(jdbcCall, in);
    }


    /**Get Single Transaction Details
     * @param jdbcCall,in
     * @return
     */
    private Object getSingleTransactionDetails(SimpleJdbcCall jdbcCall, SqlParameterSource in) {
        Map out = jdbcCall.execute(in);

        List<CreditTransaction> transactions = (List<CreditTransaction>) out.get("#result-set-1");

        if(transactions!=null && transactions.size()>0)
        {
            CreditTransaction map = transactions.get(0);
            RqCreditTransactionMapper creditTransaction = new RqCreditTransactionMapper(Constants.SUCCESSFUL,"Data Retrieved Successfully",map);
            String transactionReference = map.getTransactionReference();
            creditTransaction.setTransactionReference(transactionReference);
            // Return All transactions from DB
            //// return creditTransaction;
            //Return specific transactions from Class
            CreditTransactionResponse response = new CreditTransactionResponse(Constants.SUCCESSFUL,Constants.DATA_RETRIEVED_SUCCESSFULLY,map);
            return response;
        }
        else
        {
            return new CreditTransactionResponse(Constants.FAILED,Constants.DATA_NOT_FOUND);
        }
    }

    /**Get Multiple Transaction Details
     * @param jdbcCall,in
     * @return
     */
    private Object getMultipleTransactionDetails(SimpleJdbcCall jdbcCall, SqlParameterSource in) {
        Map out = jdbcCall.execute(in);

        List<CreditTransaction> transactions = (List<CreditTransaction>) out.get("#result-set-1");

        if(transactions!=null && transactions.size()>0)
        {
            CreditTransactionResponse response = new CreditTransactionResponse(Constants.SUCCESSFUL,Constants.DATA_RETRIEVED_SUCCESSFULLY,transactions);
            return response;
        }
        else
        {
            return new CreditTransactionResponse(Constants.FAILED,Constants.DATA_NOT_FOUND);
        }
    }


    /**Get Transaction Details With Filters
     * @param initiatinInstitutionCode
     * @param destinationInstitutionCode
     * @param inquiryDateTime
     * @param creditDateTime
     * @param status
     * @param terminalId
     * @param channel
     * @return
     */
    @Override
    public Object getTransactionByFilterParameters(String initiatinInstitutionCode, String destinationInstitutionCode, String inquiryDateTime, String creditDateTime, String status, String terminalId, String channel) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("transaction_filters")
                .withReturnValue()
                .returningResultSet("#result-set-1", BeanPropertyRowMapper.newInstance(CreditTransaction.class));//.returningResultSet(SINGLE_RESULT);

        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("initiatingInstitutionCode",initiatinInstitutionCode.isEmpty()? null : initiatinInstitutionCode)
                .addValue("destinationInstitutionCode",destinationInstitutionCode.isEmpty() ? null : destinationInstitutionCode)
                .addValue("inquiryDateTime",inquiryDateTime.isEmpty()?null:inquiryDateTime)
                .addValue("creditDateTime",creditDateTime.isEmpty()? null: creditDateTime)
                .addValue("status",status.isEmpty()? null : status)
                .addValue("terminalId",terminalId.isEmpty() ? null : terminalId)
                .addValue("channel",channel.isEmpty() ? null:channel
                );

        return getMultipleTransactionDetails(jdbcCall, in);
    }

}
