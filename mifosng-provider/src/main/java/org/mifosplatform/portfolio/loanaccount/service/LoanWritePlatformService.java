/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.loanaccount.service;

import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;

public interface LoanWritePlatformService {

    CommandProcessingResult disburseLoan(Long loanId, JsonCommand command);

    CommandProcessingResult undoLoanDisbursal(Long loanId, JsonCommand command);

    CommandProcessingResult makeLoanRepayment(Long loanId, JsonCommand command);

    CommandProcessingResult adjustLoanTransaction(Long loanId, Long transactionId, JsonCommand command);

    CommandProcessingResult waiveInterestOnLoan(Long loanId, JsonCommand command);

    CommandProcessingResult writeOff(Long loanId, JsonCommand command);

    CommandProcessingResult closeLoan(Long loanId, JsonCommand command);

    CommandProcessingResult closeAsRescheduled(Long loanId, JsonCommand command);

    CommandProcessingResult addLoanCharge(Long loanId, JsonCommand command);

    CommandProcessingResult updateLoanCharge(Long loanId, Long loanChargeId, JsonCommand command);

    CommandProcessingResult deleteLoanCharge(Long loanId, Long loanChargeId, JsonCommand command);

    CommandProcessingResult waiveLoanCharge(Long loanId, Long loanChargeId, JsonCommand command);

    CommandProcessingResult loanReassignment(Long loanId, JsonCommand command);

    CommandProcessingResult bulkLoanReassignment(JsonCommand command);

    CommandProcessingResult removeLoanOfficer(Long loanId, JsonCommand command);
}