package com.fast.tool.poro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
@Data
public  class DataBean  {

        private int actorCode;
        private Object actor;
        private ActorMultiBean actorMulti;
        private Object actorMiner;
        private int favorStatus;
        private int favorAccount;

        public int getActorCode() {
            return actorCode;
        }

        public void setActorCode(int actorCode) {
            this.actorCode = actorCode;
        }

        public Object getActor() {
            return actor;
        }

        public void setActor(Object actor) {
            this.actor = actor;
        }

        public ActorMultiBean getActorMulti() {
            return actorMulti;
        }

        public void setActorMulti(ActorMultiBean actorMulti) {
            this.actorMulti = actorMulti;
        }

        public Object getActorMiner() {
            return actorMiner;
        }

        public void setActorMiner(Object actorMiner) {
            this.actorMiner = actorMiner;
        }

        public int getFavorStatus() {
            return favorStatus;
        }

        public void setFavorStatus(int favorStatus) {
            this.favorStatus = favorStatus;
        }

        public int getFavorAccount() {
            return favorAccount;
        }

        public void setFavorAccount(int favorAccount) {
            this.favorAccount = favorAccount;
        }

        public static class ActorMultiBean {


            private String address;
            private String idAddress;
            private String robustAddr;
            private String actorType;
            private String balance;
            private String availableBalance;
            private String initialBalance;
            private String lockingBalance;
            private String unlockPeriod;
            private int approvalThreshold;
            private int msgCount;
            private String tag;
            private String createTime;
            private String lastTransactionTime;
            private Object miners;
            private Object workerMiners;
            private List<String> key_addr_signers;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getIdAddress() {
                return idAddress;
            }

            public void setIdAddress(String idAddress) {
                this.idAddress = idAddress;
            }

            public String getRobustAddr() {
                return robustAddr;
            }

            public void setRobustAddr(String robustAddr) {
                this.robustAddr = robustAddr;
            }

            public String getActorType() {
                return actorType;
            }

            public void setActorType(String actorType) {
                this.actorType = actorType;
            }

            public String getBalance() {
                return balance;
            }

            public void setBalance(String balance) {
                this.balance = balance;
            }

            public String getAvailableBalance() {
                return availableBalance;
            }

            public void setAvailableBalance(String availableBalance) {
                this.availableBalance = availableBalance;
            }

            public String getInitialBalance() {
                return initialBalance;
            }

            public void setInitialBalance(String initialBalance) {
                this.initialBalance = initialBalance;
            }

            public String getLockingBalance() {
                return lockingBalance;
            }

            public void setLockingBalance(String lockingBalance) {
                this.lockingBalance = lockingBalance;
            }

            public String getUnlockPeriod() {
                return unlockPeriod;
            }

            public void setUnlockPeriod(String unlockPeriod) {
                this.unlockPeriod = unlockPeriod;
            }

            public int getApprovalThreshold() {
                return approvalThreshold;
            }

            public void setApprovalThreshold(int approvalThreshold) {
                this.approvalThreshold = approvalThreshold;
            }

            public int getMsgCount() {
                return msgCount;
            }

            public void setMsgCount(int msgCount) {
                this.msgCount = msgCount;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getLastTransactionTime() {
                return lastTransactionTime;
            }

            public void setLastTransactionTime(String lastTransactionTime) {
                this.lastTransactionTime = lastTransactionTime;
            }

            public Object getMiners() {
                return miners;
            }

            public void setMiners(Object miners) {
                this.miners = miners;
            }

            public Object getWorkerMiners() {
                return workerMiners;
            }

            public void setWorkerMiners(Object workerMiners) {
                this.workerMiners = workerMiners;
            }

            public List<String> getKey_addr_signers() {
                return key_addr_signers;
            }

            public void setKey_addr_signers(List<String> key_addr_signers) {
                this.key_addr_signers = key_addr_signers;
            }
        }
    }