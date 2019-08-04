alter table ZXC_IPRCOMP_COMPETENCY_LINK add constraint FK_IPRCOM_IPRCOMP foreign key (IPRCOMP_ID) references ZXC_IPRCOMP(ID);
alter table ZXC_IPRCOMP_COMPETENCY_LINK add constraint FK_IPRCOM_COMPETENCY foreign key (COMPETENCY_ID) references ZXC_COMPETENCY(ID);
